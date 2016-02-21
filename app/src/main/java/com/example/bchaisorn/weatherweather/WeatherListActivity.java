package com.example.bchaisorn.weatherweather;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bchaisorn.weatherweather.Details.WeatherDetailActivity;
import com.example.bchaisorn.weatherweather.Utils.AppConstants;
import com.example.bchaisorn.weatherweather.Utils.DataUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class WeatherListActivity extends AppCompatActivity {

    @InjectView(R.id.weather_list_view)
    RecyclerView weatherListView;

    @InjectView(R.id.myFAB)
    FloatingActionButton addZipFab;

    LinearLayoutManager layoutManager;

    WeatherListAdapter weatherListAdapter;

    AlertDialog enterZipDialog;

    final List<String> values = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ButterKnife.inject(this);

        populateInitialData();

        layoutManager = new LinearLayoutManager(this);
        weatherListView.setLayoutManager(layoutManager);

        weatherListAdapter = new WeatherListAdapter(this, values);
        weatherListView.setAdapter(weatherListAdapter);

        setupZipDialog();

        addZipFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterZipDialog.show();
            }
        });
    }

    private void populateInitialData() {
        values.add("78752");
        values.add("90210");
        values.add("54202");
    }

    private void setupZipDialog() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle(getString(R.string.enter_zip_code));
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);

        alertDialogBuilder
                .setCancelable(true)
                .setView(input)
                .setPositiveButton(getString(R.string.save), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        if (DataUtils.isValidZipCode(input.getText().toString())) {
                            values.add(input.getText().toString());
                            weatherListAdapter.notifyDataSetChanged();
                            input.setText("");

                            Intent intent = new Intent(getApplicationContext(), WeatherDetailActivity.class);
                            intent.putExtra(AppConstants.ZIPCODE, input.getText().toString());
                            startActivity(intent);
                        } else {
                            Toast error = Toast.makeText(getApplicationContext(), getString(R.string.invalid_zip_code), Toast.LENGTH_SHORT);
                            error.show();
                        }
                    }
                })
                .setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        enterZipDialog = alertDialogBuilder.create();
    }
}
