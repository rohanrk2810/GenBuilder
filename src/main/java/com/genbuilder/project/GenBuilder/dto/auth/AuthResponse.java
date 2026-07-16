package com.genbuilder.project.GenBuilder.dto.auth;

public record AuthResponse
        (String token
        , UserProfileResponse user) {

}


