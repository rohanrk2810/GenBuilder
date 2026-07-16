package com.genbuilder.project.GenBuilder.dto.auth;

public record ProfileResponse(
        Long id ,
        String email ,
        String name ,
        String avatarUrl
) {
}
