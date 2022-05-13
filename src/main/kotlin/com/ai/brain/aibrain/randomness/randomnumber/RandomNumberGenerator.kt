package com.ai.brain.aibrain.randomness.randomnumber

import com.ai.brain.aibrain.randomness.generator.GenerationStrategy
import com.ai.brain.aibrain.randomness.generator.RandomGeneratorRequestType
import org.springframework.stereotype.Service

@Service
class RandomNumberGenerator: GenerationStrategy
{
    override var minRange: Int = 0
    override var maxRange: Int = 101
    override var type: RandomGeneratorRequestType = RandomGeneratorRequestType.RANDOMNUMBER

    override fun generate(): String = "Got a random number for you ${(minRange..maxRange).random()}"
}