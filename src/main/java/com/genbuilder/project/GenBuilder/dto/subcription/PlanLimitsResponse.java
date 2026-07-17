package com.genbuilder.project.GenBuilder.dto.subcription;

public record PlanLimitsResponse(
        String planName,
        Integer maxTokenPerDay,
        Integer maxProjects,
        Boolean unlimitedAi
) {
}
