package com.example.nxtstayz.repository;

import com.example.nxtstayz.model.Hotel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface HotelJpaRepository extends JpaRepository<Hotel, Integer> {
    
}