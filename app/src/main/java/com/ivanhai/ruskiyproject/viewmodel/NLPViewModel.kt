package com.ivanhai.ruskiyproject.viewmodel

import android.graphics.Bitmap
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ivanhai.ruskiyproject.data.Doc
import com.ivanhai.ruskiyproject.repository.NLPRepo
import kotlinx.coroutines.launch

class NLPViewModel(): ViewModel() {
    val data: MutableState<Doc?> = mutableStateOf(null)
    val svg: MutableState<Bitmap?> = mutableStateOf(null)
    fun data(text:String) {
        viewModelScope.launch {
            val result = NLPRepo.request(text)
            data.value = result
        }
    }
    fun svg(text: String) {
        viewModelScope.launch {
            val result = NLPRepo.svg(text)
            svg.value = result
        }
    }
}