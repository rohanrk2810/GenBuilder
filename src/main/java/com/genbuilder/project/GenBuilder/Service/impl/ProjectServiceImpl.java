package com.genbuilder.project.GenBuilder.Service.impl;

import com.genbuilder.project.GenBuilder.Service.ProjectService;
import com.genbuilder.project.GenBuilder.dto.Project.ProjectRequest;
import com.genbuilder.project.GenBuilder.dto.Project.ProjectResponse;
import com.genbuilder.project.GenBuilder.dto.Project.ProjectSummaryResponse;
import com.genbuilder.project.GenBuilder.entity.Project;
import com.genbuilder.project.GenBuilder.entity.User;
import com.genbuilder.project.GenBuilder.repository.ProjectRepository;
import com.genbuilder.project.GenBuilder.repository.UserRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)


// Class Staring Point ------------------------------------------ //
public class ProjectServiceImpl implements ProjectService {


    ProjectRepository projectRepository;
    UserRepository userRepository;

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

        User Owner = userRepository.findById(userId).orElseThrow();

        Project project = Project.builder()
                .name(request.name())
                .owner(Owner)
                .build();


        //  project = projectRepository.save(project);



        //  return new ProjectResponse(project.getId(), project.getName(), project.getCreatedAt(), project.getUpdatedAt()  );

      //  ------------------------- Work Are Pending Please Covering the Latter in side the Code ___________ Ending the Today Repo As ProjectServiceImpl.java-----------
        return null; // After the Writing the Code Please Remove the Null and Return the Above Commented Code
    }



    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {

        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
