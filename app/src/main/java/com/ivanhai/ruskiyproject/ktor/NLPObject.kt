package com.ivanhai.ruskiyproject.ktor

import io.ktor.client.call.*
import io.ktor.client.request.*

object NLPObject {
    suspend fun Doc(sentence: String): NLPData {
        return KtorClient.HttpClient.get("/${sentence}").body()
    }
}
