package com.example.koinapplication.module

import com.example.koinapplication.repository.BandaRepository
import com.example.koinapplication.repository.MusicoRepository
import com.example.koinapplication.repository.impl.BandaRepositoryImpl
import com.example.koinapplication.repository.impl.MusicoRepositoryImpl
import org.koin.dsl.module

val appModule = module {

    // Vai criar uma nova instância da classe toda vez que for chamada
    factory <BandaRepository> { BandaRepositoryImpl() }

    // Vai criar uma única instância da classe na aplicação e vai utilizá-la sempre em cada chamada
    single <MusicoRepository> { MusicoRepositoryImpl() }

}