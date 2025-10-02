package com.example.weathernotificationapp.domain.repository

import com.example.weathernotificationapp.domain.model.Weather

interface WeatherRepository {
    suspend fun getWeather(city: String): Weather
}