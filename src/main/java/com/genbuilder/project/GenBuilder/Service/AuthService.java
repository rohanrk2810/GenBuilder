package com.genbuilder.project.GenBuilder.Service;

import com.genbuilder.project.GenBuilder.dto.auth.LoginRequest;
import com.genbuilder.project.GenBuilder.dto.auth.SignupRequest;
import jakarta.annotation.Nullable;
import org.springframework.http.ProblemDetail;

public interface AuthService {
    AuthService signup(SignupRequest request);
    AuthService login(LoginRequest request);
}
