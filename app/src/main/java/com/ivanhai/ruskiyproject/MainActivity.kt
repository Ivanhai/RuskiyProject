package com.ivanhai.ruskiyproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ivanhai.ruskiyproject.ui.theme.RuskiyProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RuskiyProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Morph("Светофор")
                }
            }
        }
    }
}

@Composable
fun Morph(word: String) {
    Card {
        Column {
            Text(text = word, style = MaterialTheme.typography.h2)
        }
    }
}

@Preview
@Composable
fun MorphPreview() {
    Morph("светофоры")
}