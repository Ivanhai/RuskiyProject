package com.ivanhai.ruskiyproject.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Sent(
    @SerialName("end")
    val end: Int,
    @SerialName("start")
    val start: Int
)