package com.genbuilder.project.GenBuilder.dto.subcription;

import java.time.Instant;

public record SubscriptionResponse(
   PlanResponse plan ,
   String status,
   Instant periodEnd,
   Long tokensUsedThisCycle

) {
}
