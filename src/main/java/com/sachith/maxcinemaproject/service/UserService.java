package com.ravindupriyankarapremachandra.maxcinemaproject.service;

import com.ravindupriyankarapremachandra.maxcinemaproject.dto.UserDTO;
import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Users;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, Users.class));
        return userDTO;
    }
}
