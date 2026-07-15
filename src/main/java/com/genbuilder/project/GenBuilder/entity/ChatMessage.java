package com.genbuilder.project.GenBuilder.entity;

import com.genbuilder.project.GenBuilder.enums.MessageRole;

import java.time.Instant;

public class ChatMessage {

    Long id ;

    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolscalls;

    Integer tokensUsed;

    Instant createdAt;


}
