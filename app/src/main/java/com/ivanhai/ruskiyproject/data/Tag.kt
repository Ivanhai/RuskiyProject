package com.ivanhai.ruskiyproject.data

@kotlinx.serialization.Serializable
enum class Tag(val partOfSpeech: String) {
    NOUN("существительное"),
    ADP("предлог"),
    VERB("глагол"),
    NUM("числительное"),
    ADJ("прилагательное"),
    CCONJ("союз"),
    PUNCT("знак препинания"),
    PART("частица"),
    PRON("местоимение"),
    SPACE("пробел"),
    PROPN("имя собственное"),
    SYM("символ"),
    ADV("наречие"),
    X("другое")
}