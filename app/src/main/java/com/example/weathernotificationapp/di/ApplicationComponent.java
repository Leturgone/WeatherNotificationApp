package com.example.weathernotificationapp.di;

import com.example.weathernotificationapp.di.modules.ApiModule;
import com.example.weathernotificationapp.di.modules.AppModule;
import com.example.weathernotificationapp.di.modules.RepositoryModule;
import com.example.weathernotificationapp.di.modules.UseCaseModule;
import com.example.weathernotificationapp.domain.usecases.GetWeatherUseCase;
import com.example.weathernotificationapp.presentation.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ApiModule.class, RepositoryModule.class, UseCaseModule.class})
public interface ApplicationComponent {
    void inject(MainActivity activity);

    GetWeatherUseCase getGetWeatherUseCase();
}