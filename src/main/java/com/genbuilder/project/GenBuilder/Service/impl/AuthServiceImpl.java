package com.genbuilder.project.GenBuilder.Service.impl;

import com.genbuilder.project.GenBuilder.Service.AuthService;
import com.genbuilder.project.GenBuilder.dto.auth.LoginRequest;
import com.genbuilder.project.GenBuilder.dto.auth.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl  implements AuthService {
    @Override
    public AuthService signup(SignupRequest  request){
        return null;
    }

    @Override
    public AuthService login (LoginRequest  request){
        return null;
    }


}
