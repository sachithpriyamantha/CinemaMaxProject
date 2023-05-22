package com.ravindupriyankarapremachandra.maxcinemaproject.service;

import com.ravindupriyankarapremachandra.maxcinemaproject.dto.seatDTO;
import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Seat;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.SeatRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SeatService {
    @Autowired
    private SeatRepo seatRepo;

    @Autowired
    private ModelMapper modelMapper;

    public seatDTO bookSeat(seatDTO seatDto){
        seatRepo.save(modelMapper.map(seatDto, Seat.class));
        return seatDto;
    }

}
