package com.ivanhai.ruskiyproject.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Morphology(
    @SerialName("Animacy")
    val animacy: Animacy? = null,
    @SerialName("Case")
    val case: String? = null,
    @SerialName("Gender")
    val gender: Gender? = null,
    @SerialName("Number")
    val number: String? = null,
    @SerialName("Tense")
    val tense: String? = null,
    @SerialName("VerbFrom")
    val verbForm: String? = null,
    @SerialName("Voice")
    val voice: String? = null,
)

@Serializable
enum class Animacy(val explanation:String) {
    Anim("одушевленный"),
    Inan("неодушевленный"),
}

@Serializable
enum class Case(val explanation:String) {
    Nom("подлежащие"),
    Inan("неодушевленный"),
}

@Serializable
enum class Gender(val explanation:String) {
    Fem("женский"),
    Masc("мужской"),
    Neut("средний")
}