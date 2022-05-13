package com.ai.brain.command

import org.springframework.data.mongodb.core.mapping.Document

@Document
class CommandEntity(
    var command: String
)