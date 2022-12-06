package com.ivanhai.ruskiyproject.data.morphology

import kotlinx.serialization.Serializable

@Serializable
enum class Animacy(val explanation:String) {
    Anim("одушевленный"),
    Inan("неодушевленный"),
}