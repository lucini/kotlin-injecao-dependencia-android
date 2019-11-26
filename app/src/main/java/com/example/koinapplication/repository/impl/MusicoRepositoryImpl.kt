package com.example.koinapplication.repository.impl

import com.example.koinapplication.model.Musico
import com.example.koinapplication.repository.MusicoRepository

class MusicoRepositoryImpl: MusicoRepository {
    override fun findFirst(): Musico {
        val musicoList: List<Musico> = listOf(Musico(1L ,"Ronnie James Dio"))

        return musicoList.first()
    }
}