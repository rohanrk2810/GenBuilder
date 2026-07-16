package com.genbuilder.project.GenBuilder.Service;

import com.genbuilder.project.GenBuilder.dto.Project.ProjectRequest;
import com.genbuilder.project.GenBuilder.dto.Project.ProjectResponse;
import com.genbuilder.project.GenBuilder.dto.Project.ProjectSummaryResponse;
import java.util.List;

public interface ProjectService {
   // List<ProjectSummaryResponse> getAllProjects(Long userId) ;


            List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);



    // ProjectResponse getProjectById(Long id, Long userId);
}

