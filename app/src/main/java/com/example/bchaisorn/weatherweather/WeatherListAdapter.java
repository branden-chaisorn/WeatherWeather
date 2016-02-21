package com.example.bchaisorn.weatherweather;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bchaisorn.weatherweather.Details.WeatherDetailActivity;
import com.example.bchaisorn.weatherweather.Utils.AppConstants;

import java.util.List;

/**
 * Created by bchaisorn on 2/17/16.
 */
public class WeatherListAdapter extends RecyclerView.Adapter<WeatherListAdapter.WeatherItemViewHolder> {
    private List<String> zipCodes;
    private Context context;
    private AlertDialog deleteDialog;

    public WeatherListAdapter(Context context, List<String> myDataset) {
        zipCodes = myDataset;
        this.context = context;
    }

    @Override
    public WeatherItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.weather_list_item, parent, false);

        return new WeatherItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(WeatherItemViewHolder holder, final int position) {
        holder.zipCodeTextView.setText(zipCodes.get(position));

        holder.weatherItemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToWeatherDetails(zipCodes.get(position));
            }
        });

        holder.weatherItemLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                setUpAndShowDeleteDialog(position);
                deleteDialog.show();
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return zipCodes.size();
    }

    private void setUpAndShowDeleteDialog(final int position) {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle(context.getString(R.string.remove_this_item));
        alertDialogBuilder
                .setCancelable(true)
                .setPositiveButton(context.getString(R.string.remove), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        zipCodes.remove(position);
                        notifyDataSetChanged();

                    }
                })
                .setNegativeButton(context.getString(R.string.cancel), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        deleteDialog = alertDialogBuilder.create();
    }

    private void navigateToWeatherDetails(String zipCode) {
        Intent intent = new Intent(context, WeatherDetailActivity.class);
        intent.putExtra(AppConstants.ZIPCODE, zipCode);
        context.startActivity(intent);
    }

    public final class WeatherItemViewHolder extends RecyclerView.ViewHolder {
        public TextView zipCodeTextView;
        public View weatherItemLayout;

        public WeatherItemViewHolder(View v) {
            super(v);
            zipCodeTextView = (TextView) v.findViewById(R.id.zipcode);
            weatherItemLayout = v;
        }
    }
}
