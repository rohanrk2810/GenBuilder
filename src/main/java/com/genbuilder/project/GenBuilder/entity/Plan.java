package com.genbuilder.project.GenBuilder.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    Long id ;

    String name ;

    String stripaPriceId;
    Integer maxProjects;
    Integer minTokenPerDay;
    Integer maxPerviews; // Maximum pre-views allowed
    Boolean unlimitedAi; // Unlimeted uses for the ai / and unlimed acces the LLM

    Boolean active;


}
