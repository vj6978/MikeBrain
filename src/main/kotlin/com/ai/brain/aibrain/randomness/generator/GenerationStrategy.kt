package com.ai.brain.aibrain.randomness.generator

interface GenerationStrategy
{
    var maxRange: Int
    var minRange: Int
    var type: RandomGeneratorRequestType
    fun generate(): String
}