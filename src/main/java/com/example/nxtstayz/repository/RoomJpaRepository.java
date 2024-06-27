package com.example.nxtstayz.repository;

import com.example.nxtstayz.model.*;
import java.util.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoomJpaRepository extends JpaRepository<Room, Integer> {
    List<Room> findByHotel(Hotel hotel);
}