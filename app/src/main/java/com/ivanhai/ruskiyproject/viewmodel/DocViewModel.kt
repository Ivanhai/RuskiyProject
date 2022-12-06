package com.ivanhai.ruskiyproject.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ivanhai.ruskiyproject.data.Doc
import com.ivanhai.ruskiyproject.repository.NLPRepo
import kotlinx.coroutines.launch

class DocViewModel(text: String): ViewModel() {
    val doc: MutableState<Doc?> = mutableStateOf(null)
    init {
        viewModelScope.launch {
            doc.value = NLPRepo.doc(text)
        }
    }
}