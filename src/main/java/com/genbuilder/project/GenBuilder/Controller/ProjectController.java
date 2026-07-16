package com.genbuilder.project.GenBuilder.Controller;


/*{
//TODO : inside multiple methods, we are using hardcoded userId = 1L, we need to replace it with the real userId from Spring Security Context
        }*/


//import com.genbuilder.project.GenBuilder.Service.ProjectService;
import com.genbuilder.project.GenBuilder.Service.ProjectService;
import com.genbuilder.project.GenBuilder.dto.Project.ProjectRequest;
import com.genbuilder.project.GenBuilder.dto.Project.ProjectResponse;
import com.genbuilder.project.GenBuilder.dto.Project.ProjectSummaryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/project")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>>getMyProject(){
        Long userId = 1L; // TODO : update later with Real Spring Security User ID
        return ResponseEntity.ok(projectService.getUserProjects(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id) {
        Long userId = 1L;


        return ResponseEntity.ok(projectService.getProjectById(id, userId));
    }
    @PostMapping
    public ResponseEntity<ProjectResponse>createProject(@RequestBody ProjectRequest request) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request , userId));
    }

    @PatchMapping({"/{id}"})
    public ResponseEntity<ProjectResponse>updateProject(@PathVariable Long id, @RequestBody ProjectRequest request) {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.updateProject(id, request, userId));


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        Long userId = 1L;
        projectService.softDelete(id,userId);
                return ResponseEntity.noContent().build();
    }



}

