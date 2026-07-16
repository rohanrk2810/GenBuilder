package com.genbuilder.project.GenBuilder.dto.auth;

public record UserProfileResponse(
        Long id ,
        String email ,
        String name ,
        String avatarUrl
) {
}
