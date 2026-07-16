package com.genbuilder.project.GenBuilder.dto.subcription;

public record UsageTodayResponse(
        int tokensused,
        int tokenslimit,
        int previewsRunning,
        int previewLimit

) {

}
