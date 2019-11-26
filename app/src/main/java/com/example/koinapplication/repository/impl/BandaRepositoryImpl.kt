package com.example.koinapplication.repository.impl

import com.example.koinapplication.model.Banda
import com.example.koinapplication.repository.BandaRepository

class BandaRepositoryImpl: BandaRepository {
    override fun findAll() = listOf(Banda(1L, "Motorhead"), Banda(2L, "Megadeth"))
}