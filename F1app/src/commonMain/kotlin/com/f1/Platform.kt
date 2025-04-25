package com.f1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform