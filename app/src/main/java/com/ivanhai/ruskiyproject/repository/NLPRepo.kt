package com.ivanhai.ruskiyproject.repository

import com.ivanhai.ruskiyproject.data.Doc
import com.ivanhai.ruskiyproject.networking.KtorClient
import io.ktor.client.call.*
import io.ktor.client.request.*


object NLPRepo {
    suspend fun doc(text: String): Doc {
        return KtorClient.HttpClient.get(text).body()
    }
}