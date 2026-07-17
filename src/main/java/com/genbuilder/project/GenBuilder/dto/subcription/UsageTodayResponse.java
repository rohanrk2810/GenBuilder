package com.genbuilder.project.GenBuilder.dto.subcription;

public record UsageTodayResponse(
        Integer tokensused,
        Integer tokenslimit,
        Integer previewsRunning,
        Integer previewLimit

) {

}
