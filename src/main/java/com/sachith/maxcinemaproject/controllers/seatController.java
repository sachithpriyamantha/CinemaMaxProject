package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Cookies;
import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Seats;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.BookSeat;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.*;
import com.ravindupriyankarapremachandra.maxcinemaproject.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


@Controller
public class seatController {

    public int seat_count = 0;

    @Autowired
    SeatRepo seatRepo;

    @Autowired
    SeatService seatService;

    @Autowired
    SeatsRepo seatsRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    MoviesRepo moviesRepo;

    @Autowired
    CookiesRepo cookiesRepo;


    @GetMapping("/seats/{film_name}/{username}")
    public String seats(Model model,@PathVariable("film_name") String name,@PathVariable("username")String userName) {



        //long deleteRows = seatRepo.deleteByStatus(false);
        Cookies cookies = new Cookies(1,userName);
        cookiesRepo.save(cookies);




        model.addAttribute("userSeat", new BookSeat());
        model.addAttribute("filmName", name); // use this on url
        model.addAttribute("url",name);
        model.addAttribute("listOfSeats", seatRepo.getAllRecords(1));
        model.addAttribute("listOfSeats2", seatRepo.getAllRecords(2));
        model.addAttribute("listOfSeats3", seatRepo.getAllRecords(3));
        model.addAttribute("listOfSeats4", seatRepo.getAllRecords(4));
        model.addAttribute("listOfSeats5", seatRepo.getAllRecords(5));
        model.addAttribute("listOfSeats6", seatRepo.getAllRecords(6));
        model.addAttribute("listOfSeats7", seatRepo.getAllRecords(7));
        model.addAttribute("listOfSeats8", seatRepo.getAllRecords(8));
        model.addAttribute("listOfSeats9", seatRepo.getAllRecords(9));
        model.addAttribute("listOfSeats10", seatRepo.getAllRecords(10));

        model.addAttribute("listOfSeats11", seatRepo.getAllRecords(11));
        model.addAttribute("listOfSeats12", seatRepo.getAllRecords(12));
        model.addAttribute("listOfSeats13", seatRepo.getAllRecords(13));
        model.addAttribute("listOfSeats14", seatRepo.getAllRecords(14));
        model.addAttribute("listOfSeats15", seatRepo.getAllRecords(15));
        model.addAttribute("listOfSeats16", seatRepo.getAllRecords(16));
        model.addAttribute("listOfSeats17", seatRepo.getAllRecords(17));
        model.addAttribute("listOfSeats18", seatRepo.getAllRecords(18));
        model.addAttribute("listOfSeats19", seatRepo.getAllRecords(19));
        model.addAttribute("listOfSeats20", seatRepo.getAllRecords(20));

        model.addAttribute("listOfSeats21", seatRepo.getAllRecords(21));
        model.addAttribute("listOfSeats22", seatRepo.getAllRecords(22));
        model.addAttribute("listOfSeats23", seatRepo.getAllRecords(23));
        model.addAttribute("listOfSeats24", seatRepo.getAllRecords(24));
        model.addAttribute("listOfSeats25", seatRepo.getAllRecords(25));
        model.addAttribute("listOfSeats26", seatRepo.getAllRecords(26));
        model.addAttribute("listOfSeats27", seatRepo.getAllRecords(27));
        model.addAttribute("listOfSeats28", seatRepo.getAllRecords(28));
        model.addAttribute("listOfSeats29", seatRepo.getAllRecords(29));
        model.addAttribute("listOfSeats30", seatRepo.getAllRecords(30));

        model.addAttribute("listOfSeats31", seatRepo.getAllRecords(31));
        model.addAttribute("listOfSeats32", seatRepo.getAllRecords(32));
        model.addAttribute("listOfSeats33", seatRepo.getAllRecords(33));
        model.addAttribute("listOfSeats34", seatRepo.getAllRecords(34));
        model.addAttribute("listOfSeats35", seatRepo.getAllRecords(35));
        model.addAttribute("listOfSeats36", seatRepo.getAllRecords(36));
        model.addAttribute("listOfSeats37", seatRepo.getAllRecords(37));
        model.addAttribute("listOfSeats38", seatRepo.getAllRecords(38));
        model.addAttribute("listOfSeats39", seatRepo.getAllRecords(39));
        model.addAttribute("listOfSeats40", seatRepo.getAllRecords(40));

        model.addAttribute("listOfSeats41", seatRepo.getAllRecords(41));
        model.addAttribute("listOfSeats42", seatRepo.getAllRecords(42));
        model.addAttribute("listOfSeats43", seatRepo.getAllRecords(43));
        model.addAttribute("listOfSeats44", seatRepo.getAllRecords(44));
        model.addAttribute("listOfSeats45", seatRepo.getAllRecords(45));
        model.addAttribute("listOfSeats46", seatRepo.getAllRecords(46));
        model.addAttribute("listOfSeats47", seatRepo.getAllRecords(47));
        model.addAttribute("listOfSeats48", seatRepo.getAllRecords(48));
        model.addAttribute("listOfSeats49", seatRepo.getAllRecords(49));
        model.addAttribute("listOfSeats50", seatRepo.getAllRecords(50));

        model.addAttribute("listOfSeats51", seatRepo.getAllRecords(51));
        model.addAttribute("listOfSeats52", seatRepo.getAllRecords(52));
        model.addAttribute("listOfSeats53", seatRepo.getAllRecords(53));
        model.addAttribute("listOfSeats54", seatRepo.getAllRecords(54));
        model.addAttribute("listOfSeats55", seatRepo.getAllRecords(55));
        model.addAttribute("listOfSeats56", seatRepo.getAllRecords(56));
        model.addAttribute("listOfSeats57", seatRepo.getAllRecords(57));
        model.addAttribute("listOfSeats58", seatRepo.getAllRecords(58));
        model.addAttribute("listOfSeats59", seatRepo.getAllRecords(59));
        model.addAttribute("listOfSeats60", seatRepo.getAllRecords(60));

        model.addAttribute("listOfSeats61", seatRepo.getAllRecords(61));
        model.addAttribute("listOfSeats62", seatRepo.getAllRecords(62));
        model.addAttribute("listOfSeats63", seatRepo.getAllRecords(63));
        model.addAttribute("listOfSeats64", seatRepo.getAllRecords(64));
        model.addAttribute("listOfSeats65", seatRepo.getAllRecords(65));
        model.addAttribute("listOfSeats66", seatRepo.getAllRecords(66));
        model.addAttribute("listOfSeats67", seatRepo.getAllRecords(67));
        model.addAttribute("listOfSeats68", seatRepo.getAllRecords(68));
        model.addAttribute("listOfSeats69", seatRepo.getAllRecords(69));
        model.addAttribute("listOfSeats70", seatRepo.getAllRecords(70));

        model.addAttribute("listOfSeats71", seatRepo.getAllRecords(71));
        model.addAttribute("listOfSeats72", seatRepo.getAllRecords(72));
        model.addAttribute("listOfSeats73", seatRepo.getAllRecords(73));
        model.addAttribute("listOfSeats74", seatRepo.getAllRecords(74));
        model.addAttribute("listOfSeats75", seatRepo.getAllRecords(75));
        model.addAttribute("listOfSeats76", seatRepo.getAllRecords(76));
        model.addAttribute("listOfSeats77", seatRepo.getAllRecords(77));
        model.addAttribute("listOfSeats78", seatRepo.getAllRecords(78));
        model.addAttribute("listOfSeats79", seatRepo.getAllRecords(79));
        model.addAttribute("listOfSeats80", seatRepo.getAllRecords(80));

        model.addAttribute("listOfSeats81", seatRepo.getAllRecords(81));
        model.addAttribute("listOfSeats82", seatRepo.getAllRecords(82));
        model.addAttribute("listOfSeats83", seatRepo.getAllRecords(83));
        model.addAttribute("listOfSeats84", seatRepo.getAllRecords(84));
        model.addAttribute("listOfSeats85", seatRepo.getAllRecords(85));
        model.addAttribute("listOfSeats86", seatRepo.getAllRecords(86));
        model.addAttribute("listOfSeats87", seatRepo.getAllRecords(87));
        model.addAttribute("listOfSeats88", seatRepo.getAllRecords(88));

        //model.addAttribute("filmName", deleteRows);




        return "seat";
    }

    @PostMapping("seats/bookSeat/{filmName}")
    public String getSeat(@ModelAttribute BookSeat bookSeat, Model model,@PathVariable("filmName")String filmName){

        String username = cookiesRepo.getCookiesById(1);
        //System.out.println("user name is:"+username);
        //System.out.println("user id is:-"+userRepo.findByUsername(username));
        //System.out.println("get movie id:"+moviesRepo.getMovieByName(filmName));


        Random rand = new Random(); //generate random number
        int upperBound = 999999999;
        int rand_number = rand.nextInt(upperBound);




        if(bookSeat.isSeat01()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){

                Seats seats01 = new Seats(rand_number, 1, true,userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats01);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if (bookSeat.isSeat02()) {
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){

                Seats seats02 = new Seats(rand_number, 2, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats02);
                seat_count += 1;
            }
            else {return "booked";}
        }


        if(bookSeat.isSeat03()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats03 = new Seats(rand_number, 3, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats03);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat04()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats04 = new Seats(rand_number, 4, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats04);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat05()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats05 = new Seats(rand_number, 5, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats05);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat06()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats06 = new Seats(rand_number, 6, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats06);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat07()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats07 = new Seats(rand_number, 7, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats07);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat08()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats08 = new Seats(rand_number, 8, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats08);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat09()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats09 = new Seats(rand_number, 9, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats09);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat10()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats10 = new Seats(rand_number, 10, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats10);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat11()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats11 = new Seats(rand_number, 11, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats11);
                seat_count += 1;
            }
            else {return "booked";}
        }
        if(bookSeat.isSeat12()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats12 = new Seats(rand_number, 12, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats12);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat13()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats13 = new Seats(rand_number, 13, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats13);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat14()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats14 = new Seats(rand_number, 14, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats14);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat15()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats15 = new Seats(rand_number, 15, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats15);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat16()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats16 = new Seats(rand_number, 16, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats16);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat17()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats17 = new Seats(rand_number, 17, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats17);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat18()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats18 = new Seats(rand_number, 18, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats18);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat19()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats19 = new Seats(rand_number, 19, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats19);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat20()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats20 = new Seats(rand_number, 20, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats20);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat21()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats21 = new Seats(rand_number, 21, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats21);
                seat_count += 1;
            }
            else {return "booked";}
        }
        if(bookSeat.isSeat22()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats22 = new Seats(rand_number, 22, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats22);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat23()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats23 = new Seats(rand_number, 23, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats23);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat24()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats24 = new Seats(rand_number, 24, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats24);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat25()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats25 = new Seats(rand_number, 25, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats25);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat26()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats26 = new Seats(rand_number, 26, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats26);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat27()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats27 = new Seats(rand_number, 27, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats27);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat28()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats28 = new Seats(rand_number, 28, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats28);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat29()) {
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){

                Seats seats29 = new Seats(rand_number, 29, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats29);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat30()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats30 = new Seats(rand_number, 30, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats30);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat31()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats31 = new Seats(rand_number, 31, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats31);
                seat_count += 1;
            }
            else {return "booked";}
        }
        if(bookSeat.isSeat32()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats32 = new Seats(rand_number, 32, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats32);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat33()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats33 = new Seats(rand_number, 33, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats33);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat34()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats34 = new Seats(rand_number, 34, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats34);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat35()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats35 = new Seats(rand_number, 35, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats35);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat36()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats36 = new Seats(rand_number, 36, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats36);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat37()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats37 = new Seats(rand_number, 37, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats37);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat38()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats38 = new Seats(rand_number, 38, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats38);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat39()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats39 = new Seats(rand_number, 39, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats39);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat40()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats40 = new Seats(rand_number, 40, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats40);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat41()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats41 = new Seats(rand_number, 41, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats41);
                seat_count += 1;
            }
            else {return "booked";}
        }
        if(bookSeat.isSeat42()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats42 = new Seats(rand_number, 42, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats42);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat43()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats43 = new Seats(rand_number, 43, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats43);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat44()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats44 = new Seats(rand_number, 44, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats44);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat45()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats45 = new Seats(rand_number,45,true,userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats45);
                seat_count +=1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat46()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats46 = new Seats(rand_number, 46, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats46);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat47()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats47 = new Seats(rand_number, 47, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats47);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat48()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats48 = new Seats(rand_number, 48, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats48);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat49()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats49 = new Seats(rand_number, 49, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats49);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat50()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats50 = new Seats(rand_number, 50, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats50);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat51()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats51 = new Seats(rand_number, 51, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats51);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat52()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats52 = new Seats(rand_number, 52, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats52);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat53()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats53 = new Seats(rand_number, 53, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats53);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat54()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats54 = new Seats(rand_number, 54, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats54);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat55()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats55 = new Seats(rand_number, 55, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats55);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat56()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats56 = new Seats(rand_number, 56, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats56);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat57()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats57 = new Seats(rand_number, 57, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats57);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat58()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats58 = new Seats(rand_number, 58, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats58);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat59()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats59 = new Seats(rand_number, 59, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats59);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat60()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats60 = new Seats(rand_number, 60, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats60);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat61()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats61 = new Seats(rand_number, 61, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats61);
                seat_count += 1;
            }
            else {return "booked";}
        }
        if(bookSeat.isSeat62()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats62 = new Seats(rand_number, 62, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats62);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat63()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats63 = new Seats(rand_number, 63, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats63);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat64()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats64 = new Seats(rand_number, 64, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats64);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat65()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats65 = new Seats(rand_number, 65, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats65);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat66()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats66 = new Seats(rand_number, 66, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats66);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat67()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats67 = new Seats(rand_number, 67, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats67);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat68()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats68 = new Seats(rand_number, 68, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats68);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat69()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats69 = new Seats(rand_number, 69, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats69);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat70()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats70 = new Seats(rand_number, 70, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats70);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat71()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats71 = new Seats(rand_number, 71, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats71);
                seat_count += 1;
            }
            else {return "booked";}
        }
        if(bookSeat.isSeat72()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats72 = new Seats(rand_number, 72, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats72);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat73()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats73 = new Seats(rand_number, 73, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats73);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat74()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats74 = new Seats(rand_number, 74, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats74);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat75()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats75 = new Seats(rand_number, 75, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats75);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat76()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats76 = new Seats(rand_number, 76, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats76);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat77()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats77 = new Seats(rand_number, 77, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats77);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat78()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats78 = new Seats(rand_number, 78, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats78);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat79()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats79 = new Seats(rand_number, 79, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats79);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat80()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats80 = new Seats(rand_number, 80, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats80);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat81()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats81 = new Seats(rand_number, 81, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats81);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat82()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats82 = new Seats(rand_number, 82, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats82);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat83()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats83 = new Seats(rand_number, 83, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats83);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat84()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats84 = new Seats(rand_number, 84, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats84);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat85()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats85 = new Seats(rand_number, 85, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats85);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat86()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats86 = new Seats(rand_number, 86, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats86);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat87()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats87 = new Seats(rand_number, 87, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats87);
                seat_count += 1;
            }
            else {return "booked";}
        }

        if(bookSeat.isSeat88()){
            if(seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName)) || !seatsRepo.getSeatsByMovie_id(moviesRepo.getMovieByName(filmName))){
                Seats seats88 = new Seats(rand_number, 88, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats88);
                seat_count += 1;
            }
            else {return "booked";}
        }






        model.addAttribute("userSeat",new BookSeat());
        return "redirect:http://127.0.0.1:8080/payment/"+seat_count;
    }

    @GetMapping("/payment/{value}") // pass values through the url
    public String payment(Model model, @PathVariable("value") int values){
        double value = (double) (values * 1.81); //type casting
        model.addAttribute("value",value);
        model.addAttribute("currency","USD");
        return "payment";
    }

}
//EOF
