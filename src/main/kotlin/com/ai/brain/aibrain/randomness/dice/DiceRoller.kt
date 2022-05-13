package com.ai.brain.aibrain.randomness.dice

import com.ai.brain.aibrain.randomness.generator.GenerationStrategy
import com.ai.brain.aibrain.randomness.generator.RandomGeneratorRequestType
import org.springframework.stereotype.Service

@Service
class DiceRoller: GenerationStrategy
{
    override var minRange: Int = 1
    override var maxRange: Int = 6
    override var type: RandomGeneratorRequestType = RandomGeneratorRequestType.DICEROLL

    override fun generate(): String = "The result of the dice roll was ${(minRange..maxRange).random()}"
}