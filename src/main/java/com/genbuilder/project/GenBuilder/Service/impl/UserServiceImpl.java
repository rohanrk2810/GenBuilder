package com.genbuilder.project.GenBuilder.Service.impl;

import com.genbuilder.project.GenBuilder.Service.SubcriptionService;
import com.genbuilder.project.GenBuilder.Service.UserService;
import com.genbuilder.project.GenBuilder.dto.auth.UserProfileResponse;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
