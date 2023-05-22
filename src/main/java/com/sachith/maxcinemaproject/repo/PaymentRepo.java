package com.ravindupriyankarapremachandra.maxcinemaproject.repo;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payments,Integer> {
}
