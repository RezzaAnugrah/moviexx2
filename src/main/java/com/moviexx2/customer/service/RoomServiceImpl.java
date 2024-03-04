package com.moviexx2.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.moviexx2.customer.dto.ResponseData;
import com.moviexx2.customer.entity.Room;
import com.moviexx2.customer.repository.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository repository;

    @Override
    public ResponseData addRoom(Room request) {
        repository.save(request);
        return new ResponseData(HttpStatus.OK.value(),"Success", request);
    }

    @Override
    public ResponseData getRoom() {
        List<Room> rooms = repository.findAll();
        return new ResponseData(HttpStatus.OK.value(),"Success", rooms);
    }
    

}