package com.example.weathernotificationapp.presentation.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.weathernotificationapp.R
import com.example.weathernotificationapp.di.MyApplication
import com.example.weathernotificationapp.domain.usecases.GetWeatherUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var getWeatherUseCase: GetWeatherUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MyApplication).applicationComponent.inject(this)

        //REFACTOR

        lifecycleScope.launch {
            val result = getWeatherUseCase("moscow")
            Log.i("RETRO",result.toString())
        }

    }
}