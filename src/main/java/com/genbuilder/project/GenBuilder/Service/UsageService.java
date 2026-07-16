package com.genbuilder.project.GenBuilder.Service;

import com.genbuilder.project.GenBuilder.dto.subcription.PlanLimitsResponse;
import com.genbuilder.project.GenBuilder.dto.subcription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsage(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfuser(Long userId);
}
