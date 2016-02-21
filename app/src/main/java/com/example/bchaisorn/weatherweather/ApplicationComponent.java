package com.example.bchaisorn.weatherweather;

import android.content.Context;

import com.example.bchaisorn.weatherweather.Details.WeatherDetailActivity;
import com.google.gson.Gson;

import javax.inject.Singleton;
import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by bchaisorn on 2/20/16.
 */
@Singleton
@Component(modules=ApplicationModule.class)
public interface ApplicationComponent {
    Context context();
    Retrofit retrofit();
    Gson gson();

    void inject(WeatherDetailActivity weatherDetailActivity);
}
