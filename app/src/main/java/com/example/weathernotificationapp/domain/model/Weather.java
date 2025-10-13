package com.example.weathernotificationapp.domain.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Objects;

public class Weather {
    @Nullable private Integer temp;
    @Nullable private String main;
    @Nullable private String description;
    @Nullable private Integer windSpeed;

    public Weather() {
    }

    public Weather(@Nullable Integer temp, @Nullable String main, @Nullable String description, @Nullable Integer windSpeed) {
        this.temp = temp;
        this.main = main;
        this.description = description;
        this.windSpeed = windSpeed;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    @Nullable
    public String getMain() {
        return main;
    }

    @Nullable
    public Integer getTemp() {
        return temp;
    }

    @Nullable
    public Integer getWindSpeed() {
        return windSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Objects.equals(temp, weather.temp) &&
                Objects.equals(main, weather.main) &&
                Objects.equals(description, weather.description) &&
                Objects.equals(windSpeed, weather.windSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temp, main, description, windSpeed);
    }

    @NonNull
    @Override
    public String toString() {
        return "Weather{" +
                "temp=" + temp +
                ", main='" + main + '\'' +
                ", description='" + description + '\'' +
                ", windSpeed=" + windSpeed +
                '}';
    }
}
