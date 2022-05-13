package com.ai.brain.aibrain.randomness.generator

import com.ai.brain.aibrain.randomness.request.RandomGeneratorRequest
import org.springframework.stereotype.Service

@Service
class RandomGeneratorService(
    private val generatorStrategies: List<GenerationStrategy>
)
{
    fun generate(randomGeneratorRequest: RandomGeneratorRequest): String =
        generatorStrategies.first { it.type.name == randomGeneratorRequest.type.name }.generate()
}