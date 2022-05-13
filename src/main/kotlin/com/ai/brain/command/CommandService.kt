package com.ai.brain.command

import com.ai.brain.aibrain.Reception
import mu.KotlinLogging
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class CommandService(
    private val commandMapper: CommandMapper,
    private val commandRepository: CommandRepository,
    private val reception: Reception
)
{
    fun postCommandAndReturnParsedResponse(commandDTO: CommandDTO): CommandResponseDTO
    {
        val commandEntity = commandMapper.dtoToEntity(commandDTO)
        val savedEntity = commandRepository.save(commandEntity)
        logger.debug { "Saved Command: $savedEntity" }
        val parsedResponse = reception.parseCommand(commandDTO.command)
        return parsedResponse
    }
}