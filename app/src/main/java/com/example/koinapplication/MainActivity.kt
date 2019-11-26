package com.example.koinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koinapplication.repository.BandaRepository
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val bandaRepository: BandaRepository by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(bandaRepository.findAll())
    }
}
