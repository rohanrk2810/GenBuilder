package com.genbuilder.project.GenBuilder.Service.impl;

import com.genbuilder.project.GenBuilder.Service.ProjectService;
import com.genbuilder.project.GenBuilder.dto.Project.ProjectRequest;
import com.genbuilder.project.GenBuilder.dto.Project.ProjectResponse;
import com.genbuilder.project.GenBuilder.dto.Project.ProjectSummaryResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return List.of();
    }

    @Override
    public ProjectResponse getProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
