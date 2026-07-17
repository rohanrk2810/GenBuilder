package com.genbuilder.project.GenBuilder.Service.impl;

import com.genbuilder.project.GenBuilder.Service.PlanService;
import com.genbuilder.project.GenBuilder.dto.subcription.PlanResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlanServiceImpl implements PlanService {


    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
