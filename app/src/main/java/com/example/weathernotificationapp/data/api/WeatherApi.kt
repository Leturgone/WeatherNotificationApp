package com.example.weathernotificationapp.data.api

import com.example.example.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("/weather")
    suspend fun getWeather(
        @Query("q") cityName: String,
        @Query("apiid") apikey: String = API_KEY
    ): WeatherResponse
}