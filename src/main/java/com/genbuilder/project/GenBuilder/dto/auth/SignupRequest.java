package com.genbuilder.project.GenBuilder.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
