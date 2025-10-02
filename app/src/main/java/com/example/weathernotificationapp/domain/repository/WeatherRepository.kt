package com.example.weathernotificationapp.domain.repository;

import com.example.weathernotificationapp.domain.model.Weather;

import org.jetbrains.annotations.NotNull;

public interface WeatherRepository {
    @NotNull Weather getWeather(String city);
}
