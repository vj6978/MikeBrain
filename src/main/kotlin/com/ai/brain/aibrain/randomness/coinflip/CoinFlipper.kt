package com.ai.brain.aibrain.randomness.coinflip

import com.ai.brain.aibrain.randomness.generator.GenerationStrategy
import com.ai.brain.aibrain.randomness.generator.RandomGeneratorRequestType
import org.springframework.stereotype.Service

@Service
class CoinFlipper: GenerationStrategy
{
    override var minRange: Int = 0
    override var maxRange: Int = 1
    override var type: RandomGeneratorRequestType = RandomGeneratorRequestType.COINFLIP

    override fun generate(): String = "Result of the coin flip was ${CoinFace.values().first { it.value == (minRange..maxRange).random()}}"
}