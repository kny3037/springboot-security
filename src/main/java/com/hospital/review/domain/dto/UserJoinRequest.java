package com.hospital.review.domain.dto;

import com.hospital.review.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserJoinRequest {
    private String userName;
    private String password;
    private String email;

    public User toEntity(String password){
        return User.builder()
                .userName(this.userName)
                .password(password)
                .emailAddress(this.email)
                .build();
    }
}
