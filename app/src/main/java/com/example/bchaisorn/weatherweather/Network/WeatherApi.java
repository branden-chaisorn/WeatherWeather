package com.example.bchaisorn.weatherweather.Network;

import com.example.bchaisorn.weatherweather.Models.BaseResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by bchaisorn on 2/20/16.
 */
public interface WeatherApi {

    @GET("q/{zipcode}.json")
    Call<BaseResponse> getWeatherData(@Path("zipcode") String zipcode);

}