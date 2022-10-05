package com.ivanhai.ruskiyproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.chaquo.python.Python
import com.chaquo.python.android.AndroidPlatform
import com.ivanhai.ruskiyproject.spacy.Spacy
import com.ivanhai.ruskiyproject.ui.theme.RuskiyProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(!Python.isStarted()) {
            Python.start(AndroidPlatform(this))
            Spacy.install()
        }
        setContent {
            RuskiyProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Шла саша по шоссе и сосала сушку")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val coroutineScope = rememberCoroutineScope()
    val (text, setText) = remember { mutableStateOf(name) }
    setText(Spacy.print(name)[0].call("text").toString())
    Text(text = text)
}