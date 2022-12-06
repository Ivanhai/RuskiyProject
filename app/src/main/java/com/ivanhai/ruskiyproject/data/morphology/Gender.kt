package com.ivanhai.ruskiyproject.data.morphology

import kotlinx.serialization.Serializable

@Serializable
enum class Gender(val explanation:String) {
    Fem("женский"),
    Masc("мужской"),
    Neut("средний")
}