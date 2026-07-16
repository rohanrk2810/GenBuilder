package com.genbuilder.project.GenBuilder.dto.member;

import com.genbuilder.project.GenBuilder.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
