package com.genbuilder.project.GenBuilder.Controller;


import com.genbuilder.project.GenBuilder.Service.UsageService;
import com.genbuilder.project.GenBuilder.dto.subcription.PlanLimitsResponse;
import com.genbuilder.project.GenBuilder.dto.subcription.UsageTodayResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/usage")
public class UsageController {


    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse>getUsageToday() {
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getTodayUsage(userId));
    }


    @GetMapping("limits")
    public ResponseEntity<PlanLimitsResponse>getPlanLimits() {
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsOfuser(userId));
    }

}
