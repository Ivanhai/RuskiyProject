package com.ivanhai.ruskiyproject.data.morphology

import kotlinx.serialization.Serializable

@Serializable
enum class Person(val explanation:String) {
    First("первое"),
    Second("второе"),
    Third("третье")
}