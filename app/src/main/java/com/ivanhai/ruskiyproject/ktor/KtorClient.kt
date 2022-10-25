package com.ivanhai.ruskiyproject.ktor

import com.ivanhai.ruskiyproject.BuildConfig
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.resources.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*

object KtorClient {
    val HttpClient = HttpClient(CIO) {
        install(ContentNegotiation) {
            json()
        }
        if(!BuildConfig.DEBUG) {
            defaultRequest {
                host = "localhost"
                port = 8000
                url { protocol = URLProtocol.HTTP }
            }
        } else {
            defaultRequest {
                host = "hosting.com"
                port = 80
                url { protocol = URLProtocol.HTTPS }
            }
        }
        install(Resources)
    }
}