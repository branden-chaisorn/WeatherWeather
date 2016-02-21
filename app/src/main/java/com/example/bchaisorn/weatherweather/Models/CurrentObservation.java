package com.example.bchaisorn.weatherweather.Models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by bchaisorn on 2/20/16.
 */

public class CurrentObservation implements Parcelable {

    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("display_location")
    @Expose
    private DisplayLocation displayLocation;
    @SerializedName("observation_location")
    @Expose
    private ObservationLocation observationLocation;
    @SerializedName("station_id")
    @Expose
    private String stationId;
    @SerializedName("observation_time")
    @Expose
    private String observationTime;
    @SerializedName("observation_time_rfc822")
    @Expose
    private String observationTimeRfc822;
    @SerializedName("observation_epoch")
    @Expose
    private String observationEpoch;
    @SerializedName("local_time_rfc822")
    @Expose
    private String localTimeRfc822;
    @SerializedName("local_epoch")
    @Expose
    private String localEpoch;
    @SerializedName("local_tz_short")
    @Expose
    private String localTzShort;
    @SerializedName("local_tz_long")
    @Expose
    private String localTzLong;
    @SerializedName("local_tz_offset")
    @Expose
    private String localTzOffset;
    @SerializedName("weather")
    @Expose
    private String weather;
    @SerializedName("temperature_string")
    @Expose
    private String temperatureString;
    @SerializedName("temp_f")
    @Expose
    private Double tempF;
    @SerializedName("temp_c")
    @Expose
    private Double tempC;
    @SerializedName("relative_humidity")
    @Expose
    private String relativeHumidity;
    @SerializedName("wind_string")
    @Expose
    private String windString;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("wind_degrees")
    @Expose
    private Integer windDegrees;
    @SerializedName("wind_mph")
    @Expose
    private Double windMph;
    @SerializedName("wind_gust_mph")
    @Expose
    private String windGustMph;
    @SerializedName("wind_kph")
    @Expose
    private Double windKph;
    @SerializedName("wind_gust_kph")
    @Expose
    private String windGustKph;
    @SerializedName("pressure_mb")
    @Expose
    private String pressureMb;
    @SerializedName("pressure_in")
    @Expose
    private String pressureIn;
    @SerializedName("pressure_trend")
    @Expose
    private String pressureTrend;
    @SerializedName("dewpoint_string")
    @Expose
    private String dewpointString;
    @SerializedName("dewpoint_f")
    @Expose
    private Integer dewpointF;
    @SerializedName("dewpoint_c")
    @Expose
    private Integer dewpointC;
    @SerializedName("heat_index_string")
    @Expose
    private String heatIndexString;
    @SerializedName("heat_index_f")
    @Expose
    private String heatIndexF;
    @SerializedName("heat_index_c")
    @Expose
    private String heatIndexC;
    @SerializedName("windchill_string")
    @Expose
    private String windchillString;
    @SerializedName("windchill_f")
    @Expose
    private String windchillF;
    @SerializedName("windchill_c")
    @Expose
    private String windchillC;
    @SerializedName("feelslike_string")
    @Expose
    private String feelslikeString;
    @SerializedName("feelslike_f")
    @Expose
    private String feelslikeF;
    @SerializedName("feelslike_c")
    @Expose
    private String feelslikeC;
    @SerializedName("visibility_mi")
    @Expose
    private String visibilityMi;
    @SerializedName("visibility_km")
    @Expose
    private String visibilityKm;
    @SerializedName("solarradiation")
    @Expose
    private String solarradiation;
    @SerializedName("UV")
    @Expose
    private String UV;
    @SerializedName("precip_1hr_string")
    @Expose
    private String precip1hrString;
    @SerializedName("precip_1hr_in")
    @Expose
    private String precip1hrIn;
    @SerializedName("precip_1hr_metric")
    @Expose
    private String precip1hrMetric;
    @SerializedName("precip_today_string")
    @Expose
    private String precipTodayString;
    @SerializedName("precip_today_in")
    @Expose
    private String precipTodayIn;
    @SerializedName("precip_today_metric")
    @Expose
    private String precipTodayMetric;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("forecast_url")
    @Expose
    private String forecastUrl;
    @SerializedName("history_url")
    @Expose
    private String historyUrl;
    @SerializedName("ob_url")
    @Expose
    private String obUrl;
    @SerializedName("nowcast")
    @Expose
    private String nowcast;

    /**
     *
     * @return
     * The image
     */
    public Image getImage() {
        return image;
    }

    /**
     *
     * @return
     * The displayLocation
     */
    public DisplayLocation getDisplayLocation() {
        return displayLocation;
    }

    /**
     *
     * @return
     * The observationLocation
     */
    public ObservationLocation getObservationLocation() {
        return observationLocation;
    }

    /**
     *
     * @return
     * The stationId
     */
    public String getStationId() {
        return stationId;
    }

    /**
     *
     * @return
     * The observationTime
     */
    public String getObservationTime() {
        return observationTime;
    }

    /**
     *
     * @return
     * The observationTimeRfc822
     */
    public String getObservationTimeRfc822() {
        return observationTimeRfc822;
    }

    /**
     *
     * @return
     * The observationEpoch
     */
    public String getObservationEpoch() {
        return observationEpoch;
    }

    /**
     *
     * @return
     * The localTimeRfc822
     */
    public String getLocalTimeRfc822() {
        return localTimeRfc822;
    }

    /**
     *
     * @return
     * The localEpoch
     */
    public String getLocalEpoch() {
        return localEpoch;
    }

    /**
     *
     * @return
     * The localTzShort
     */
    public String getLocalTzShort() {
        return localTzShort;
    }

    /**
     *
     * @return
     * The localTzLong
     */
    public String getLocalTzLong() {
        return localTzLong;
    }

    /**
     *
     * @return
     * The localTzOffset
     */
    public String getLocalTzOffset() {
        return localTzOffset;
    }

    /**
     *
     * @return
     * The weather
     */
    public String getWeather() {
        return weather;
    }

    /**
     *
     * @return
     * The temperatureString
     */
    public String getTemperatureString() {
        return temperatureString;
    }

    /**
     *
     * @return
     * The tempF
     */
    public Double getTempF() {
        return tempF;
    }

    /**
     *
     * @return
     * The tempC
     */
    public Double getTempC() {
        return tempC;
    }

    /**
     *
     * @return
     * The relativeHumidity
     */
    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     *
     * @return
     * The windString
     */
    public String getWindString() {
        return windString;
    }

    /**
     *
     * @return
     * The windDir
     */
    public String getWindDir() {
        return windDir;
    }

    /**
     *
     * @return
     * The windDegrees
     */
    public Integer getWindDegrees() {
        return windDegrees;
    }

    /**
     *
     * @return
     * The windMph
     */
    public Double getWindMph() {
        return windMph;
    }

    /**
     *
     * @return
     * The windGustMph
     */
    public String getWindGustMph() {
        return windGustMph;
    }

    /**
     *
     * @return
     * The windKph
     */
    public Double getWindKph() {
        return windKph;
    }

    /**
     *
     * @return
     * The windGustKph
     */
    public String getWindGustKph() {
        return windGustKph;
    }

    /**
     *
     * @return
     * The pressureMb
     */
    public String getPressureMb() {
        return pressureMb;
    }

    /**
     *
     * @return
     * The pressureIn
     */
    public String getPressureIn() {
        return pressureIn;
    }

    /**
     *
     * @return
     * The pressureTrend
     */
    public String getPressureTrend() {
        return pressureTrend;
    }

    /**
     *
     * @return
     * The dewpointString
     */
    public String getDewpointString() {
        return dewpointString;
    }

    /**
     *
     * @return
     * The dewpointF
     */
    public Integer getDewpointF() {
        return dewpointF;
    }

    /**
     *
     * @return
     * The dewpointC
     */
    public Integer getDewpointC() {
        return dewpointC;
    }

    /**
     *
     * @return
     * The heatIndexString
     */
    public String getHeatIndexString() {
        return heatIndexString;
    }

    /**
     *
     * @return
     * The heatIndexF
     */
    public String getHeatIndexF() {
        return heatIndexF;
    }

    /**
     *
     * @return
     * The heatIndexC
     */
    public String getHeatIndexC() {
        return heatIndexC;
    }

    /**
     *
     * @return
     * The windchillString
     */
    public String getWindchillString() {
        return windchillString;
    }

    /**
     *
     * @return
     * The windchillF
     */
    public String getWindchillF() {
        return windchillF;
    }

    /**
     *
     * @return
     * The windchillC
     */
    public String getWindchillC() {
        return windchillC;
    }

    /**
     *
     * @return
     * The feelslikeString
     */
    public String getFeelslikeString() {
        return feelslikeString;
    }

    /**
     *
     * @return
     * The feelslikeF
     */
    public String getFeelslikeF() {
        return feelslikeF;
    }

    /**
     *
     * @return
     * The feelslikeC
     */
    public String getFeelslikeC() {
        return feelslikeC;
    }

    /**
     *
     * @return
     * The visibilityMi
     */
    public String getVisibilityMi() {
        return visibilityMi;
    }

    /**
     *
     * @return
     * The visibilityKm
     */
    public String getVisibilityKm() {
        return visibilityKm;
    }

    /**
     *
     * @return
     * The solarradiation
     */
    public String getSolarradiation() {
        return solarradiation;
    }

    /**
     *
     * @return
     * The UV
     */
    public String getUV() {
        return UV;
    }

    /**
     *
     * @return
     * The precip1hrString
     */
    public String getPrecip1hrString() {
        return precip1hrString;
    }

    /**
     *
     * @return
     * The precip1hrIn
     */
    public String getPrecip1hrIn() {
        return precip1hrIn;
    }

    /**
     *
     * @return
     * The precip1hrMetric
     */
    public String getPrecip1hrMetric() {
        return precip1hrMetric;
    }

    /**
     *
     * @return
     * The precipTodayString
     */
    public String getPrecipTodayString() {
        return precipTodayString;
    }

    /**
     *
     * @return
     * The precipTodayIn
     */
    public String getPrecipTodayIn() {
        return precipTodayIn;
    }

    /**
     *
     * @return
     * The precipTodayMetric
     */
    public String getPrecipTodayMetric() {
        return precipTodayMetric;
    }

    /**
     *
     * @return
     * The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     *
     * @return
     * The iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     *
     * @return
     * The forecastUrl
     */
    public String getForecastUrl() {
        return forecastUrl;
    }

    /**
     *
     * @return
     * The historyUrl
     */
    public String getHistoryUrl() {
        return historyUrl;
    }

    /**
     *
     * @return
     * The obUrl
     */
    public String getObUrl() {
        return obUrl;
    }

    /**
     *
     * @return
     * The nowcast
     */
    public String getNowcast() {
        return nowcast;
    }


    protected CurrentObservation(Parcel in) {
        image = (Image) in.readValue(Image.class.getClassLoader());
        displayLocation = (DisplayLocation) in.readValue(DisplayLocation.class.getClassLoader());
        observationLocation = (ObservationLocation) in.readValue(ObservationLocation.class.getClassLoader());
        stationId = in.readString();
        observationTime = in.readString();
        observationTimeRfc822 = in.readString();
        observationEpoch = in.readString();
        localTimeRfc822 = in.readString();
        localEpoch = in.readString();
        localTzShort = in.readString();
        localTzLong = in.readString();
        localTzOffset = in.readString();
        weather = in.readString();
        temperatureString = in.readString();
        tempF = in.readByte() == 0x00 ? null : in.readDouble();
        tempC = in.readByte() == 0x00 ? null : in.readDouble();
        relativeHumidity = in.readString();
        windString = in.readString();
        windDir = in.readString();
        windDegrees = in.readByte() == 0x00 ? null : in.readInt();
        windMph = in.readByte() == 0x00 ? null : in.readDouble();
        windGustMph = in.readString();
        windKph = in.readByte() == 0x00 ? null : in.readDouble();
        windGustKph = in.readString();
        pressureMb = in.readString();
        pressureIn = in.readString();
        pressureTrend = in.readString();
        dewpointString = in.readString();
        dewpointF = in.readByte() == 0x00 ? null : in.readInt();
        dewpointC = in.readByte() == 0x00 ? null : in.readInt();
        heatIndexString = in.readString();
        heatIndexF = in.readString();
        heatIndexC = in.readString();
        windchillString = in.readString();
        windchillF = in.readString();
        windchillC = in.readString();
        feelslikeString = in.readString();
        feelslikeF = in.readString();
        feelslikeC = in.readString();
        visibilityMi = in.readString();
        visibilityKm = in.readString();
        solarradiation = in.readString();
        UV = in.readString();
        precip1hrString = in.readString();
        precip1hrIn = in.readString();
        precip1hrMetric = in.readString();
        precipTodayString = in.readString();
        precipTodayIn = in.readString();
        precipTodayMetric = in.readString();
        icon = in.readString();
        iconUrl = in.readString();
        forecastUrl = in.readString();
        historyUrl = in.readString();
        obUrl = in.readString();
        nowcast = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(image);
        dest.writeValue(displayLocation);
        dest.writeValue(observationLocation);
        dest.writeString(stationId);
        dest.writeString(observationTime);
        dest.writeString(observationTimeRfc822);
        dest.writeString(observationEpoch);
        dest.writeString(localTimeRfc822);
        dest.writeString(localEpoch);
        dest.writeString(localTzShort);
        dest.writeString(localTzLong);
        dest.writeString(localTzOffset);
        dest.writeString(weather);
        dest.writeString(temperatureString);
        if (tempF == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeDouble(tempF);
        }
        if (tempC == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeDouble(tempC);
        }
        dest.writeString(relativeHumidity);
        dest.writeString(windString);
        dest.writeString(windDir);
        if (windDegrees == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(windDegrees);
        }
        if (windMph == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeDouble(windMph);
        }
        dest.writeString(windGustMph);
        if (windKph == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeDouble(windKph);
        }
        dest.writeString(windGustKph);
        dest.writeString(pressureMb);
        dest.writeString(pressureIn);
        dest.writeString(pressureTrend);
        dest.writeString(dewpointString);
        if (dewpointF == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(dewpointF);
        }
        if (dewpointC == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(dewpointC);
        }
        dest.writeString(heatIndexString);
        dest.writeString(heatIndexF);
        dest.writeString(heatIndexC);
        dest.writeString(windchillString);
        dest.writeString(windchillF);
        dest.writeString(windchillC);
        dest.writeString(feelslikeString);
        dest.writeString(feelslikeF);
        dest.writeString(feelslikeC);
        dest.writeString(visibilityMi);
        dest.writeString(visibilityKm);
        dest.writeString(solarradiation);
        dest.writeString(UV);
        dest.writeString(precip1hrString);
        dest.writeString(precip1hrIn);
        dest.writeString(precip1hrMetric);
        dest.writeString(precipTodayString);
        dest.writeString(precipTodayIn);
        dest.writeString(precipTodayMetric);
        dest.writeString(icon);
        dest.writeString(iconUrl);
        dest.writeString(forecastUrl);
        dest.writeString(historyUrl);
        dest.writeString(obUrl);
        dest.writeString(nowcast);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<CurrentObservation> CREATOR = new Parcelable.Creator<CurrentObservation>() {
        @Override
        public CurrentObservation createFromParcel(Parcel in) {
            return new CurrentObservation(in);
        }

        @Override
        public CurrentObservation[] newArray(int size) {
            return new CurrentObservation[size];
        }
    };
}