package com.genbuilder.project.GenBuilder.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
