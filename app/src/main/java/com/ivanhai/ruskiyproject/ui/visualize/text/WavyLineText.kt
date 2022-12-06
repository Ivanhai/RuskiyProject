package com.ivanhai.ruskiyproject.ui.visualize.text

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ivanhai.ruskiyproject.ui.utils.MeasureUnconstrainedViewWidth

@Composable
fun WavyLineText(text: String) {
    val strokeWidth = 8f
    val left = 0f
    val waveSize = 20f
    val waveSizeDp = 6.dp
    val doubleWaveSize = waveSize * 2
    val primary = MaterialTheme.colors.primary
    MeasureUnconstrainedViewWidth(
        viewToMeasure = {
            Text(text)
        }
    ) { measuredWidth ->
        Column {
            Text(text)
            Canvas(
                modifier = Modifier
                    .size(measuredWidth, waveSizeDp)
            ) {
                val width = size.width
                val height = size.height
                for (i in left.toInt()..left.toInt() + width.toInt() step doubleWaveSize.toInt()) {
                    val iF = i.toFloat()
                    drawLine(
                        primary,
                        start = Offset(iF, height),
                        end = Offset(iF + waveSize, height - waveSize),
                        strokeWidth = strokeWidth
                    )
                    drawLine(
                        primary,
                        start = Offset(iF + waveSize, height - waveSize),
                        end = Offset(iF + doubleWaveSize, height),
                        strokeWidth = strokeWidth
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun WavyLineTextPreview() {
    WavyLineText(text = "светофор")
}