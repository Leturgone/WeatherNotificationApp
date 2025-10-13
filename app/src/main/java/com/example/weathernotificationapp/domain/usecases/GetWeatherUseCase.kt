package com.example.weathernotificationapp.domain.usecases

import com.example.weathernotificationapp.domain.model.Weather
import com.example.weathernotificationapp.domain.repository.WeatherRepository
import javax.inject.Inject

class GetWeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    suspend operator fun  invoke(city: String): Result<Weather> = weatherRepository.getWeather(city)
}