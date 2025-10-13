package com.example.weathernotificationapp.di;

import android.app.Application;

import com.example.weathernotificationapp.di.modules.ApiModule;
import com.example.weathernotificationapp.di.modules.AppModule;

public class MyApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate(){

        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule("https://api.openweathermap.org/data/2.5/"))
                .build();

    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
