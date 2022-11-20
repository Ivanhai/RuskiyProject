package com.ivanhai.ruskiyproject.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Token(
    @SerialName("dep")
    val dep: String,
    @SerialName("end")
    val end: Int,
    @SerialName("head")
    val head: Int,
    @SerialName("id")
    val id: Int,
    @SerialName("lemma")
    val lemma: String,
    @SerialName("morph")
    val morph: String,
    @SerialName("pos")
    val pos: Tag,
    @SerialName("start")
    val start: Int,
    @SerialName("tag")
    val tag: Tag
)