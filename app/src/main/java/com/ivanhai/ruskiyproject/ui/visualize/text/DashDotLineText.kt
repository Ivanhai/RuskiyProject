package com.ivanhai.ruskiyproject.ui.visualize.text

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ivanhai.ruskiyproject.ui.utils.MeasureUnconstrainedViewWidth

@Composable
fun DashDotLineText(text: String) {
    val strokeWidth = 8f
    val dashSizeDp = 2.dp
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
                    start = Offset(0f, height / 2),
                    end = Offset(width, height / 2),
                    strokeWidth = strokeWidth,
                    pathEffect = PathEffect.dashPathEffect(floatArrayOf(50f, 10f, 5f, 10f), 25f)
                )
            }
        }
    }
}

@Preview
@Composable
fun DashDotLineTextPreview() {
    DashDotLineText(text = "светофор")
}