package com.ivanhai.ruskiyproject.repository

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.PictureDrawable
import com.caverock.androidsvg.SVG
import com.ivanhai.ruskiyproject.data.Doc
import com.ivanhai.ruskiyproject.networking.KtorClient
import io.ktor.client.call.*
import io.ktor.client.request.*


object NLPRepo {
    suspend fun request(text: String): Doc {
        return KtorClient.HttpClient.get(text).body()
    }
    suspend fun svg(text: String): Bitmap {
        val svgAsString: String = KtorClient.HttpClient.get("render/$text").body()
        val svg = SVG.getFromString(svgAsString);
        val picture = svg.renderToPicture()
        val pd = PictureDrawable(picture)
        val bitmap =
            Bitmap.createBitmap(pd.intrinsicWidth, pd.intrinsicHeight, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        canvas.drawPicture(pd.picture)
        return bitmap
    }
}