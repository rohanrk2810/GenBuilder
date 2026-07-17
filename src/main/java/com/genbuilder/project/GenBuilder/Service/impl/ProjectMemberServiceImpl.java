package com.genbuilder.project.GenBuilder.Service.impl;

import com.genbuilder.project.GenBuilder.Service.ProjectMemberService;
import com.genbuilder.project.GenBuilder.dto.member.InviteMemberRequest;
import com.genbuilder.project.GenBuilder.dto.member.MemberResponse;
import com.genbuilder.project.GenBuilder.entity.ProjectMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public List<ProjectMember> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
