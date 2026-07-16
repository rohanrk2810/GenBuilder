package com.genbuilder.project.GenBuilder.Service;

import com.genbuilder.project.GenBuilder.dto.subcription.CheckoutRequest;
import com.genbuilder.project.GenBuilder.dto.subcription.CheckoutResponse;
import com.genbuilder.project.GenBuilder.dto.subcription.PortalResponse;
import com.genbuilder.project.GenBuilder.dto.subcription.SubscriptionResponse;

public interface SubcriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);

}
