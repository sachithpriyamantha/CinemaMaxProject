package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Mail;
import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Payments;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.Order;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.MailRepo;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.PaymentRepo;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.UserRepo;
import com.ravindupriyankarapremachandra.maxcinemaproject.service.MailService;
import com.ravindupriyankarapremachandra.maxcinemaproject.service.PaypalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class PaypalController {

	@Autowired
	UserRepo userRepo;
	@Autowired
	PaypalService service;

	@Autowired
	MailRepo mailRepo;

	@Autowired
	MailService mailService;

	@Autowired
	PaymentRepo paymentRepo;

	public static final String SUCCESS_URL = "pay/success";
	public static final String CANCEL_URL = "pay/cancel";

	/**generate Random Number **/
	Random rand = new Random();
	int upperBound = 999999999;
	int rand_number = rand.nextInt(upperBound);

	@PostMapping("/pay")
	public String payment(@ModelAttribute("order") Order order) {
		try {
			Payment payment = service.createPayment(order.getPrice(), order.getCurrency(), order.getMethod(),
					order.getIntent(), order.getDescription(), "http://127.0.0.1:8080/" + CANCEL_URL,
					"http://127.0.0.1:8080/" + SUCCESS_URL+"/"+order.getPrice());
			for(Links link:payment.getLinks()) {
				if(link.getRel().equals("approval_url")) {
					return "redirect:"+link.getHref();
				}
			}
			
		} catch (PayPalRESTException e) {
		
			e.printStackTrace();
		}
		return "redirect:/home";
	}
	
	 @GetMapping(value = CANCEL_URL)
	    public String cancelPay(@CookieValue(value = "USERNAME")String username) {
		/*** Payment failed mail ***/
			mailService.mailSend(userRepo.findByEmailMatches(username),"Payment Failed","Hi\t"+username+"Your payment is not success. Please contact us if you have an issue.\nThank you.");
			/*** save mail in database **/
			Mail mail = new Mail(rand_number,"payment","payment failed",userRepo.findByUsername(username));
			mailRepo.save(mail);

	        return "cancel";
	    }

	    @GetMapping(value = SUCCESS_URL+"/{amount}")
	    public String successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId,@PathVariable("amount") double amount,@CookieValue(value = "USERNAME")String username) {
	        try {
	            Payment payment = service.executePayment(paymentId, payerId);
	            System.out.println(payment.toJSON());
	            if (payment.getState().equals("approved")) {

					/*** Payment Success mail ***/
					mailService.mailSend(userRepo.findByEmailMatches(username),"Payment success","Hi\t"+username+"Your payment is  success. Please contact us if you have an issue.\nThank you.");
					/*** save mail in database **/
					Mail mail = new Mail(rand_number,"payment","payment success",userRepo.findByUsername(username));
					mailRepo.save(mail);

					Payments payments = new Payments(rand_number,amount,"paid successfully",userRepo.findByUsername(username));
					paymentRepo.save(payments);

	                return "success";
	            }
	        } catch (PayPalRESTException e) {
	         System.out.println(e.getMessage());
	        }
	        return "redirect:/payment";
	    }

}
