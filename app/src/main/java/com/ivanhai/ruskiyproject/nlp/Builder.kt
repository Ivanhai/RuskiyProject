package com.ivanhai.ruskiyproject.nlp

import com.londogard.nlp.tokenizer.CharTokenizer

class Builder(sentence: String) {
    var tokens:List<String> = listOf("null")
    init {
        tokens = CharTokenizer().split(sentence)
    }
}