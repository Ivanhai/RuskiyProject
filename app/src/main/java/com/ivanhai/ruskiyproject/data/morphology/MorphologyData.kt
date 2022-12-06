package com.ivanhai.ruskiyproject.data.morphology

import com.ivanhai.ruskiyproject.data.morphology.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MorphologyData(
    @SerialName("Animacy")
    val animacy: Animacy? = null,
    @SerialName("Case")
    val case: Case? = null,
    @SerialName("Gender")
    val gender: Gender? = null,
    @SerialName("Number")
    val number: Number? = null,
    @SerialName("Tense")
    val tense: Tense? = null,
    @SerialName("VerbFrom")
    val verbForm: VerbForm? = null,
    @SerialName("Voice")
    val voice: Voice? = null,
    @SerialName("Degree")
    val degree: Degree? = null,
    @SerialName("Aspect")
    val aspect: Aspect? = null,
    @SerialName("Mood")
    val mood: Mood? = null,
    @SerialName("Person")
    val person: Person? = null,
)