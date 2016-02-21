package com.example.bchaisorn.weatherweather;

import android.app.Application;

/**
 * Created by bchaisorn on 2/20/16.
 */
public class CurrentApplication extends Application {

        private ApplicationComponent applicationComponent;

        @Override
        public void onCreate() {
            super.onCreate();

            applicationComponent = DaggerApplicationComponent
                    .builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }

        public ApplicationComponent applicationComponent() {
            return applicationComponent;
        }
}

