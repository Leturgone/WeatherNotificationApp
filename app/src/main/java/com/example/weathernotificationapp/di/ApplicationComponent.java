package com.example.weathernotificationapp.di;

import com.example.weathernotificationapp.data.api.WeatherApi;
import com.example.weathernotificationapp.di.modules.ApiModule;
import com.example.weathernotificationapp.di.modules.AppModule;
import com.example.weathernotificationapp.presentation.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface ApplicationComponent {
    void inject(MainActivity activity);

    WeatherApi getWeatherApi();
}