package com.ivanhai.ruskiyproject.data.morphology

import kotlinx.serialization.Serializable

@Serializable
enum class Case(val explanation:String) {
    Nom("именительный"),
    Gen("родительный"),
    Dat("дательный"),
    Acc("винительный"),
    Ins("творительный"),
    Loc("предложный")
}