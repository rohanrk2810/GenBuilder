package com.genbuilder.project.GenBuilder.dto.subcription;

public record PlanResponse(
        Long id,
        String name ,
        Integer maxProjects,
        Integer unlimitedAi,
        String price
) {
}
