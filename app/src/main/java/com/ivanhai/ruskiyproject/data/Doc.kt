package com.ivanhai.ruskiyproject.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Doc(
// TODO entities
//    @SerialName("ents")
//    val ents: Nothing? = null,
    @SerialName("sents")
    val sents: List<Sent>,
    @SerialName("text")
    val text: String,
    @SerialName("tokens")
    val tokens: List<Token>
)