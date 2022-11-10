package com.ivanhai.ruskiyproject.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NLPData(
    @SerialName("ents")
    val ents: List<Any>,
    @SerialName("sents")
    val sents: List<Sent>,
    @SerialName("text")
    val text: String,
    @SerialName("tokens")
    val tokens: List<Token>
)