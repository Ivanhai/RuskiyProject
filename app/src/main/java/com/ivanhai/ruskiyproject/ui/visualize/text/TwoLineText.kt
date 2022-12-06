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
fun TwoLineText(text:String) {
    val strokeWidth = 4f
    val dashSizeDp = 4.dp
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
                    .size(measuredWidth, dashSizeDp)
            ) {
                val width = size.width
                val height = size.height
                drawLine(
                    primary,
                    start = Offset(0f, 0f),
                    end = Offset(width, 0f),
                    strokeWidth = strokeWidth,
                )
                drawLine(
                    primary,
                    start = Offset(0f, height.times(0.8f)),
                    end = Offset(width, height.times(0.8f)),
                    strokeWidth = strokeWidth,
                )
            }
        }
    }
}

@Preview
@Composable
fun TwoLineTextPreview() {
    TwoLineText(text = "светофор")
}