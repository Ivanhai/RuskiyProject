package com.ivanhai.ruskiyproject.data.morphology

import kotlinx.serialization.Serializable

@Serializable
enum class Tense(val explanation:String) {
    Past("прошедшее"),
    Pres("настоящее"),
    Fut("будущее")
}