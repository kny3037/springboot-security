package com.hospital.review.service;

import com.hospital.review.domain.UserDto;
import com.hospital.review.domain.UserJoinRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserDto join(UserJoinRequest request){
        return new UserDto("","","");
    }
}
