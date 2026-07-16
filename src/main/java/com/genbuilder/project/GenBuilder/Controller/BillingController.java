package com.genbuilder.project.GenBuilder.Controller;


import com.genbuilder.project.GenBuilder.Service.PlanService;
// ...existing code... (removed unused import)
import com.genbuilder.project.GenBuilder.Service.SubcriptionService;
import com.genbuilder.project.GenBuilder.dto.subcription.*;
import lombok.AllArgsConstructor;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BillingController {
    
    
    private final PlanService planService;
    private final SubcriptionService subcriptionService;
    
    
    @GetMapping("/api/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans() {
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("/api/me/subcription")
    public ResponseEntity<SubscriptionResponse> getMySubcription(){
        Long userId = 1L;
        return ResponseEntity.ok(subcriptionService.getCurrentSubscription(userId));
    }

    @PostMapping("/api/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(
            @RequestBody CheckoutRequest request
            ) {
        Long userId = 1L;
        return ResponseEntity.ok(subcriptionService.createCheckoutSessionUrl(request,userId));

    }
    @PostMapping("/api/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomerPortal(){
        Long userId = 1L;
        return ResponseEntity.ok(subcriptionService.openCustomerPortal(userId));
    }




}









