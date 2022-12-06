package com.ivanhai.ruskiyproject.data.morphology

import kotlinx.serialization.Serializable

@Serializable
enum class Mood(val explanation:String) {
    Ind("изъявительное"),
    Imp("повелительное"),
    Subj("сослагательное")
}