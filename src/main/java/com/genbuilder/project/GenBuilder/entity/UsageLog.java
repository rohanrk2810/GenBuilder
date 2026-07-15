package com.genbuilder.project.GenBuilder.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsageLog {

    Long id;
    User user;
    Project project;

    String action ;

    Integer tokenUsed;
    Integer durationMs;

    String metaData; // JSON Of { model_used , Promt_Used}

    Instant createdAt;



}
