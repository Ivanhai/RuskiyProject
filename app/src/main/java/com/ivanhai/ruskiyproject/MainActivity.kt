package com.ivanhai.ruskiyproject


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import com.ivanhai.ruskiyproject.ui.theme.RuskiyProjectTheme
import com.ivanhai.ruskiyproject.ui.visualize.Visualizer
import com.ivanhai.ruskiyproject.viewmodel.NLPViewModel


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
                    Morph()
                }
            }
        }
    }
}

@Composable
fun Morph(viewModel: NLPViewModel = NLPViewModel()) {
    viewModel.data("я шел и упал")
    val result = viewModel.data.value

    result?.let {
        Visualizer(doc = it)
    }
}