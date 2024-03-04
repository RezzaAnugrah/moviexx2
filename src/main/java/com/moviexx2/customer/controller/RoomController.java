package com.moviexx2.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviexx2.customer.dto.ResponseData;
import com.moviexx2.customer.entity.Room;
import com.moviexx2.customer.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

     @Autowired
    RoomService service;
 
    @GetMapping (value = {"", "/"})
    public ResponseEntity<?> getList(){
        try {
            ResponseData responseData = service.getRoom();
            return ResponseEntity.status(responseData.getStatus()).body(responseData);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping (value = {"", "/"})
    public ResponseEntity<?> save(@RequestBody Room request){
        try {
            ResponseData responseData = service.addRoom(request);
            return ResponseEntity.status(responseData.getStatus()).body(responseData);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
