package com.genbuilder.project.GenBuilder.Service.impl;

import com.genbuilder.project.GenBuilder.Service.SubcriptionService;
import com.genbuilder.project.GenBuilder.dto.subcription.CheckoutRequest;
import com.genbuilder.project.GenBuilder.dto.subcription.CheckoutResponse;
import com.genbuilder.project.GenBuilder.dto.subcription.PortalResponse;
import com.genbuilder.project.GenBuilder.dto.subcription.SubscriptionResponse;
import org.springframework.stereotype.Service;

@Service
public class SubcriptionServiceImpl implements SubcriptionService {

    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
