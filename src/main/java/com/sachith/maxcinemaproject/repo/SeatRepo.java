package com.ravindupriyankarapremachandra.maxcinemaproject.repo;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Seat;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepo extends JpaRepository<Seat,Integer> {
    @Query(value = "select * from seat s where s.seat_no = ?1", nativeQuery = true)
    List<Seat> getAllRecords (int id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE public.seat SET status = true WHERE seat_id = ?1;",nativeQuery = true)
    void updateSeat(int seat_no);


    /*@Query(value = "delete from seat where status = ")
    @Override
    void delete(Seat status);*/

    //long deleteByStatus(boolean value);
}
