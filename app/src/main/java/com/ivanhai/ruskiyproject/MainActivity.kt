package com.ivanhai.ruskiyproject


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.ivanhai.ruskiyproject.ui.theme.RuskiyProjectTheme
import com.ivanhai.ruskiyproject.ui.visualize.Visualizer
import com.ivanhai.ruskiyproject.viewmodel.DocViewModel


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
                    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
                        Morph(DocViewModel("она упала, когда играла на улице"))
                    }
                }
            }
        }
    }
}

@Composable
fun Morph(viewModel: DocViewModel) {
    viewModel.doc.value?.let {
        Visualizer(doc = it)
    }
}