package com.example.koinapplication.repository

import com.example.koinapplication.model.Banda

interface BandaRepository {
    fun findAll(): List<Banda>
}