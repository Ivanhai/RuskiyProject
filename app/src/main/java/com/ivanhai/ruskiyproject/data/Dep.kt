package com.ivanhai.ruskiyproject.data

import kotlinx.serialization.Serializable

@Serializable
enum class Dep {
    ROOT,
    nsubj,
    conj,
    advmod,
    obl,
    case,
    obj,
    advcl,
    mark,
    nmod,
    amod,
    punct,
    cc,
}