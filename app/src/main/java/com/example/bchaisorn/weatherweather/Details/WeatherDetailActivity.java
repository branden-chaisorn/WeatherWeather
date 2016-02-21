package com.example.bchaisorn.weatherweather.Details;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bchaisorn.weatherweather.CurrentApplication;
import com.example.bchaisorn.weatherweather.Models.BaseResponse;
import com.example.bchaisorn.weatherweather.Network.WeatherApi;
import com.example.bchaisorn.weatherweather.R;
import com.example.bchaisorn.weatherweather.Utils.AppConstants;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class WeatherDetailActivity extends AppCompatActivity {

    @InjectView(R.id.location)
    TextView location;

    @InjectView(R.id.weather_description)
    TextView weatherDescription;

    @InjectView(R.id.temperature_f)
    TextView temperatureF;

    @InjectView(R.id.temperature_c)
    TextView temperatureC;

    @InjectView(R.id.weatherImage)
    ImageView weatherImage;

    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_detail);
        ButterKnife.inject(this);
        (((CurrentApplication) getApplication()).applicationComponent()).inject(this);

        String zipCode = getIntent().getStringExtra(AppConstants.ZIPCODE);

        WeatherApi apiService = retrofit.create(WeatherApi.class);

        Call<BaseResponse> call = apiService.getWeatherData(zipCode);
        call.enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                BaseResponse baseResponse = response.body();
                if (baseResponse.getCurrentObservation() != null) {
                    updateView(baseResponse);
                } else {
                    updateViewNoData();
                }
            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {
                // TODO: Retry connection here
            }
        });

    }

    private void updateViewNoData() {
        location.setText(getApplicationContext().getString(R.string.no_data));
    }

    private void updateView(BaseResponse baseResponse) {
        location.setText(baseResponse.getCurrentObservation().getDisplayLocation().getCity());
        weatherDescription.setText(baseResponse.getCurrentObservation().getWeather());
        temperatureF.setText(baseResponse.getCurrentObservation().getTempF().toString() + " " + getApplicationContext().getString(R.string.degrees_f));
        temperatureC.setText(baseResponse.getCurrentObservation().getTempC().toString() + " " + getApplicationContext().getString(R.string.degrees_c));
        Picasso.with(getApplicationContext()).load(baseResponse.getCurrentObservation().getIconUrl()).into(weatherImage);
        // Would handle error cases here with a default image
    }
}
