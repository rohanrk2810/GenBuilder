package com.genbuilder.project.GenBuilder.repository;

import com.genbuilder.project.GenBuilder.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
