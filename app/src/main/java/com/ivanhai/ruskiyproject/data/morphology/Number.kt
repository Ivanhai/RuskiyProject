package com.ivanhai.ruskiyproject.data.morphology

import kotlinx.serialization.Serializable

@Serializable
enum class Number(val explanation:String) {
    Sing("единственное"),
    Plur("множественное")
}