package com.ivanhai.ruskiyproject.data


import com.ivanhai.ruskiyproject.data.morphology.MorphologyData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Token(
    @SerialName("text")
    val text: String,
    @SerialName("dep")
    val dep: Dep,
    @SerialName("end")
    val end: Int,
    @SerialName("head")
    val head: Int,
    @SerialName("id")
    val id: Int,
    @SerialName("lemma")
    val lemma: String,
    @SerialName("morph")
    val morph: MorphologyData,
    @SerialName("pos")
    val pos: Tag,
    @SerialName("start")
    val start: Int,
    @SerialName("tag")
    val tag: Tag,
)