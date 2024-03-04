package com.moviexx2.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviexx2.customer.entity.Room;

// @Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
