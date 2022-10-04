package com.ivanhai.ruskiyproject.spacy

import com.chaquo.python.Kwarg
import com.chaquo.python.PyObject
import com.chaquo.python.Python

object Spacy {
    private val python = Python.getInstance()
    val stanza = python.getModule("stanza")
    val spacyStanza = python.getModule("spacy_stanza")

    val snlp = stanza.callAttr("Pipeline", Kwarg("lang", "ru"))
    val nlp = spacyStanza.callAttr("StanzaLanguage", snlp)
    fun install() {
        stanza.callAttr("download", "ru")
    }
    fun print(text: String): MutableList<PyObject> {
        return nlp.call(text).asList()
    }
}