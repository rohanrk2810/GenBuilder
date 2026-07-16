package com.genbuilder.project.GenBuilder.dto.subcription;

public record PlanLimitsResponse(
        String planName,
        int maxTokenPerDay,
        int maxProjects,
        boolean unlimitedAi
) {
}
