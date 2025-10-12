package com.example.weathernotificationapp.di.modules;

import com.example.weathernotificationapp.domain.repository.WeatherRepository;
import com.example.weathernotificationapp.domain.usecases.GetWeatherUseCase;

import dagger.Module;
import dagger.Provides;

@Module
class UseCaseModule {

    @Provides
    GetWeatherUseCase provideGetWeatherUseCase(WeatherRepository weatherRepository) {
        return new GetWeatherUseCase(weatherRepository);
    }
}
