package com.example.bchaisorn.weatherweather.Models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by bchaisorn on 2/20/16.
 */
public class ObservationLocation implements Parcelable {
    @SerializedName("full")
    @Expose
    private String full;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_iso3166")
    @Expose
    private String countryIso3166;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("elevation")
    @Expose
    private String elevation;

    /**
     *
     * @return
     * The full
     */
    public String getFull() {
        return full;
    }

    /**
     *
     * @param full
     * The full
     */
    public void setFull(String full) {
        this.full = full;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The state
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     * The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return
     * The country
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     * The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     * The countryIso3166
     */
    public String getCountryIso3166() {
        return countryIso3166;
    }

    /**
     *
     * @param countryIso3166
     * The country_iso3166
     */
    public void setCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The elevation
     */
    public String getElevation() {
        return elevation;
    }

    /**
     *
     * @param elevation
     * The elevation
     */
    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    protected ObservationLocation(Parcel in) {
        full = in.readString();
        city = in.readString();
        state = in.readString();
        country = in.readString();
        countryIso3166 = in.readString();
        latitude = in.readString();
        longitude = in.readString();
        elevation = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(full);
        dest.writeString(city);
        dest.writeString(state);
        dest.writeString(country);
        dest.writeString(countryIso3166);
        dest.writeString(latitude);
        dest.writeString(longitude);
        dest.writeString(elevation);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<ObservationLocation> CREATOR = new Parcelable.Creator<ObservationLocation>() {
        @Override
        public ObservationLocation createFromParcel(Parcel in) {
            return new ObservationLocation(in);
        }

        @Override
        public ObservationLocation[] newArray(int size) {
            return new ObservationLocation[size];
        }
    };
}