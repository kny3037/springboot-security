package com.hospital.review.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class EncrypterConfig {

    @Bean
    public BCryptPasswordEncoder encodePwd() {
        return new BCryptPasswordEncoder();// password를 인코딩 해줄때 쓰기 위함
    }
    //꼭 BCryptPasswordEncoder는 따로 만들어 줘야 한다!!
}

