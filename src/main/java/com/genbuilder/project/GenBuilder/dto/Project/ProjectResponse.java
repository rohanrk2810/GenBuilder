package com.genbuilder.project.GenBuilder.dto.Project;

import com.genbuilder.project.GenBuilder.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse (
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
){

}
