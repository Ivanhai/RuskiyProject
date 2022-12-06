package com.ivanhai.ruskiyproject.ui.visualize

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ivanhai.ruskiyproject.data.Dep
import com.ivanhai.ruskiyproject.data.Doc
import com.ivanhai.ruskiyproject.ui.visualize.text.OneLineText
import com.ivanhai.ruskiyproject.ui.visualize.text.TwoLineText

@Composable
fun Visualizer(doc: Doc) {
    Row(Modifier, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
        doc.tokens.forEach { token ->
            when(token.dep) {
                Dep.nsubj -> OneLineText(token.text)
                Dep.ROOT, Dep.conj -> TwoLineText(token.text)
                else -> Text(token.text)
            }
        }
    }
}