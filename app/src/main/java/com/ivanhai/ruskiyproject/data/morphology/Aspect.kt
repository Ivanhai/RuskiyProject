package com.ivanhai.ruskiyproject.data.morphology

import kotlinx.serialization.Serializable

@Serializable
enum class Aspect(val explanation:String) {
    Imp("несовершенный"),
    Perf("совершенный")
}