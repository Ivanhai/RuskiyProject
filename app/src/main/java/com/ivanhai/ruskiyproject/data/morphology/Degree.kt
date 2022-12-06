package com.ivanhai.ruskiyproject.data.morphology

import kotlinx.serialization.Serializable

@Serializable
enum class Degree(val explanation:String) {
    Pos("положительная"),
    Cmp("сравнительная"),
    //TODO Superlative Degree of Comparison
}