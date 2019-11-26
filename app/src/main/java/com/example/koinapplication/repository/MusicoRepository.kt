package com.example.koinapplication.repository

import com.example.koinapplication.model.Musico

interface MusicoRepository {
    fun findFirst(): Musico
}