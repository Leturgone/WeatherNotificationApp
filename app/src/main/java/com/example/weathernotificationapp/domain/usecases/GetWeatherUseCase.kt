package com.example.weathernotificationapp.domain.usecases

import com.example.weathernotificationapp.domain.model.Weather
import com.example.weathernotificationapp.domain.repository.WeatherRepository

class GetWeatherUseCase(
    private val weatherRepository: WeatherRepository
) {
    suspend fun  invoke(city: String): Result<Weather> = weatherRepository.getWeather(city)
}