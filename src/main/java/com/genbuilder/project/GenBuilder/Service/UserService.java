package com.genbuilder.project.GenBuilder.Service;

import com.genbuilder.project.GenBuilder.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
