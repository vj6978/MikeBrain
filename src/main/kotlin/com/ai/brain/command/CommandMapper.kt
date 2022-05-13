package com.ai.brain.command

import org.springframework.stereotype.Component

@Component
class CommandMapper
{
    fun dtoToEntity(commandDTO: CommandDTO): CommandEntity = CommandEntity(
        command = commandDTO.command
    )

    fun entityToDTO(commandEntity: CommandEntity): CommandDTO = CommandDTO(
        command = commandEntity.command
    )
}