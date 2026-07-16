package com.genbuilder.project.GenBuilder.Controller;


import com.genbuilder.project.GenBuilder.Service.AuthService;
import com.genbuilder.project.GenBuilder.Service.UserService;
import com.genbuilder.project.GenBuilder.dto.auth.LoginRequest;
import com.genbuilder.project.GenBuilder.dto.auth.ProfileResponse;
import com.genbuilder.project.GenBuilder.dto.auth.SignupRequest;
import com.genbuilder.project.GenBuilder.dto.auth.UserProfileResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthService> signup(SignupRequest request){

        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthService> login(LoginRequest request){

        return ResponseEntity.ok(authService.login(request));

    }


    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getMe() {
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }



}


