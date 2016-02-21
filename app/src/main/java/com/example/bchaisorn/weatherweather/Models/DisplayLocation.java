package com.example.bchaisorn.weatherweather.Models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by bchaisorn on 2/20/16.
 */
public class DisplayLocation implements Parcelable {

    @SerializedName("full")
    @Expose
    private String full;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("state_name")
    @Expose
    private String stateName;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_iso3166")
    @Expose
    private String countryIso3166;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("magic")
    @Expose
    private String magic;
    @SerializedName("wmo")
    @Expose
    private String wmo;
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
     * The stateName
     */
    public String getStateName() {
        return stateName;
    }

    /**
     *
     * @param stateName
     * The state_name
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
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
     * The zip
     */
    public String getZip() {
        return zip;
    }

    /**
     *
     * @param zip
     * The zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     *
     * @return
     * The magic
     */
    public String getMagic() {
        return magic;
    }

    /**
     *
     * @param magic
     * The magic
     */
    public void setMagic(String magic) {
        this.magic = magic;
    }

    /**
     *
     * @return
     * The wmo
     */
    public String getWmo() {
        return wmo;
    }

    /**
     *
     * @param wmo
     * The wmo
     */
    public void setWmo(String wmo) {
        this.wmo = wmo;
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


    protected DisplayLocation(Parcel in) {
        full = in.readString();
        city = in.readString();
        state = in.readString();
        stateName = in.readString();
        country = in.readString();
        countryIso3166 = in.readString();
        zip = in.readString();
        magic = in.readString();
        wmo = in.readString();
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
        dest.writeString(stateName);
        dest.writeString(country);
        dest.writeString(countryIso3166);
        dest.writeString(zip);
        dest.writeString(magic);
        dest.writeString(wmo);
        dest.writeString(latitude);
        dest.writeString(longitude);
        dest.writeString(elevation);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<DisplayLocation> CREATOR = new Parcelable.Creator<DisplayLocation>() {
        @Override
        public DisplayLocation createFromParcel(Parcel in) {
            return new DisplayLocation(in);
        }

        @Override
        public DisplayLocation[] newArray(int size) {
            return new DisplayLocation[size];
        }
    };
}