package com.example.weathernotificationapp.di.modules;

import com.example.weathernotificationapp.data.api.WeatherApi;
import com.example.weathernotificationapp.data.repository.WeatherRepositoryImpl;
import com.example.weathernotificationapp.domain.repository.WeatherRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    WeatherRepository provideWeatherRepository(WeatherApi weatherApi){
        return new WeatherRepositoryImpl(weatherApi);
    }
}
