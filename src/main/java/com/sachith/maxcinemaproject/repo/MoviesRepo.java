package com.ravindupriyankarapremachandra.maxcinemaproject.repo;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepo extends JpaRepository<Movies,Integer> {

    @Query(value = "Select * from movies m where m.id = ?1",nativeQuery = true)
    List<Movies> getAllById(int id);

    @Query(value = "select id from movies m where m.name = ?1 ",nativeQuery = true)
    int getMovieByName(String name);
}
