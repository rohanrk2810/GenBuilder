package com.genbuilder.project.GenBuilder.dto.Project;

import java.time.Instant;

public record FileNode(
        String path ,
        Instant modifiedAt,
        Long size,
        String typr
) {
}
