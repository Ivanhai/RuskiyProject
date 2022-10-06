package com.ivanhai.ruskiyproject.ktor

import com.ivanhai.ruskiyproject.BuildConfig
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*

val client = HttpClient(CIO) {
    install(ContentNegotiation) {
        json()
    }
    install(DefaultRequest) {
        if(!BuildConfig.DEBUG) url("https://notdebug.vercel.com")
    }
}