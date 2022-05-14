package com.ai.brain.aibrain

import com.ai.brain.aibrain.randomness.generator.RandomGeneratorRequestType
import com.ai.brain.aibrain.randomness.generator.RandomGeneratorService
import com.ai.brain.aibrain.randomness.request.RandomGeneratorRequest
import com.ai.brain.command.CommandResponseDTO
import org.springframework.stereotype.Service

@Service
class Reception(
    private val randomGeneratorService: RandomGeneratorService
)
{
    fun parseCommand(command: String): CommandResponseDTO
    {
        return CommandResponseDTO(randomGenerator(command))
    }

    fun randomGenerator(type: String = RandomGeneratorRequestType.JOKE.name): String
    {
        return randomGeneratorService.generate(RandomGeneratorRequest(RandomGeneratorRequestType.values().first {it.name == type}))
    }
}