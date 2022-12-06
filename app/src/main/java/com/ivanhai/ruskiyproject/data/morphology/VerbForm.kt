package com.ivanhai.ruskiyproject.data.morphology

import kotlinx.serialization.Serializable

@Serializable
enum class VerbForm(val explanation:String) {
    Inf("инфинитив"),
}