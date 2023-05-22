package com.ravindupriyankarapremachandra.maxcinemaproject.repo;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Cookies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CookiesRepo extends JpaRepository<Cookies,Integer> {

    @Query(value = "select name from cookies c where id = ?1",nativeQuery = true)
    String getCookiesById(int id);
}
