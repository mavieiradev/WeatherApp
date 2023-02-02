package com.mavieiradev.weatherapp.Utilites

import retrofit2.Call
import com.mavieiradev.weatherapp.Models.WeatherModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("weather")
    fun getCurrentWeatherData(
        @Query("lat") lat : String,
        @Query("lon") long : String,
        @Query("APPID") appid : String

    ):Call<WeatherModel>

    @GET("weather")
    fun getCityWeatherData(
        @Query("q") q : String,
        @Query("APPID") appid : String,
    ):Call<WeatherModel>

}