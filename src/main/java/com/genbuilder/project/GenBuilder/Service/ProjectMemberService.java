package com.genbuilder.project.GenBuilder.Service;

import com.genbuilder.project.GenBuilder.dto.member.InviteMemberRequest;
import com.genbuilder.project.GenBuilder.dto.member.MemberResponse;
import com.genbuilder.project.GenBuilder.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {


    MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId);

    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
    
}
