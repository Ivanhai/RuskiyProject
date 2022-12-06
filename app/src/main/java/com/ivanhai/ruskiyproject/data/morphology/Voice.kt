package com.ivanhai.ruskiyproject.data.morphology

import kotlinx.serialization.Serializable

@Serializable
enum class Voice(val explanation:String) {
    Act("действительное"),
    Pass("страдающие")
}