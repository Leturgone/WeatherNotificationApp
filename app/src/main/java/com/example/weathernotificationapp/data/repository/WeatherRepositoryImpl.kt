package com.example.weathernotificationapp.data.repository

import android.util.Log
import com.example.example.WeatherResponse
import com.example.weathernotificationapp.data.api.WeatherApi
import com.example.weathernotificationapp.domain.model.Weather
import com.example.weathernotificationapp.domain.repository.WeatherRepository
import kotlinx.coroutines.runBlocking
import kotlin.math.roundToInt

class WeatherRepositoryImpl(private val api: WeatherApi) : WeatherRepository{

    private fun WeatherResponse.convert(): Weather{
        return Weather(
            main?.temp?.roundToInt(),
            weather.getOrNull(0)?.main,
            weather.getOrNull(0)?.description,
            wind?.speed?.roundToInt()
        )
    }

    override suspend fun getWeather(city: String): Result<Weather> {
        return try {
            val result = api.getWeather(city).convert()
            Result.success(result)
        }catch (e: Exception){
            Log.e("getWeathe", e.toString())
            Result.failure(e)
        }
    }


}