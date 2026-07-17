package com.genbuilder.project.GenBuilder.repository;

import com.genbuilder.project.GenBuilder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
