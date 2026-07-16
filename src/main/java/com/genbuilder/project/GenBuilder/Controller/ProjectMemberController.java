package com.genbuilder.project.GenBuilder.Controller;


import com.genbuilder.project.GenBuilder.Service.ProjectMemberService;
import com.genbuilder.project.GenBuilder.dto.member.InviteMemberRequest;
import com.genbuilder.project.GenBuilder.dto.member.MemberResponse;
import com.genbuilder.project.GenBuilder.entity.ProjectMember;
import lombok.RequiredArgsConstructor;
 // import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project/{projectId}/members")
@RequiredArgsConstructor
public class ProjectMemberController {
    
    private final ProjectMemberService projectMemberService;
    
    @GetMapping
    public ResponseEntity<List<ProjectMember>> getProjectMembers(@PathVariable Long projectId)
    {
        Long userId = 1L;

        return ResponseEntity.ok(projectMemberService.getProjectMembers(projectId, userId));
    }

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMemeber(
            @PathVariable Long ProjectId,
            @RequestBody InviteMemberRequest request
    )
    {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(
                projectMemberService.inviteMember(
                        ProjectId, request, userId)
        );
    }


    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId,
            @RequestBody  InviteMemberRequest request

    )
    {
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectId, memberId, request, userId));
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> deleteMember(
            @PathVariable Long projectId,
            @PathVariable Long memberId
    )
    {
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.deleteProjectMember(projectId, memberId, userId));
    }

    
}
