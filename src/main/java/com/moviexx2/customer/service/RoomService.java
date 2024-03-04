package com.moviexx2.customer.service;

import com.moviexx2.customer.dto.ResponseData;
import com.moviexx2.customer.entity.Room;

public interface RoomService {
    ResponseData addRoom(Room request);
    ResponseData getRoom();
}