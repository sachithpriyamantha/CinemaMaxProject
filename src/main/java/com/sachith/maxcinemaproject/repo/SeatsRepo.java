package com.ravindupriyankarapremachandra.maxcinemaproject.repo;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatsRepo extends JpaRepository<Seats,Integer> {

    @Query(value = "select status from seats s where s.movie_id = ?1",nativeQuery = true)
    boolean getSeatsByMovie_id(int movie_id);

    @Query(value = "select count(seat_no) from seats",nativeQuery = true)
    long count();

}
