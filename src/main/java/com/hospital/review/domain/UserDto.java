package com.hospital.review.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDto {
    private String userName;
    private String password;
    private String email;
}

