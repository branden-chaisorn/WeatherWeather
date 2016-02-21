package com.example.bchaisorn.weatherweather;

import android.app.Application;
import android.content.Context;

import com.example.bchaisorn.weatherweather.Utils.AppConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bchaisorn on 2/20/16.
 */
@Module
public class ApplicationModule {

    private final Context applicationContext;

    public ApplicationModule(Application application) {
        applicationContext = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return applicationContext;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(Gson gson) {
        return new Retrofit.Builder()
                .baseUrl(AppConstants.BASEURL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}