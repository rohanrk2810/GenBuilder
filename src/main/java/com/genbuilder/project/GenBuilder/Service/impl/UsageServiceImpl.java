package com.genbuilder.project.GenBuilder.Service.impl;

import com.genbuilder.project.GenBuilder.Service.UsageService;
import com.genbuilder.project.GenBuilder.dto.subcription.PlanLimitsResponse;
import com.genbuilder.project.GenBuilder.dto.subcription.UsageTodayResponse;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsage(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfuser(Long userId) {
        return null;
    }
}
