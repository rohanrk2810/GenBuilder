package com.genbuilder.project.GenBuilder.dto.member;

import com.genbuilder.project.GenBuilder.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userid ,
        String email ,
        String name ,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}
