package com.example.bchaisorn.weatherweather.Utils;

import java.util.regex.Pattern;

/**
 * Created by bchaisorn on 2/19/16.
 */
public class DataUtils {
    public static final String ZIPCODE_REGEX =
            "^(\\d{5}(-\\d{4})?)|([ABCEGHJKLMNPRSTVXY]\\d[A-Z]( )?" +
                    "\\d[A-Z]\\d)$|(^[a-zA-z]{2}\\s([a-zA-Z]{2}|[0-9]{2})$)";

    public static boolean isValidZipCode(String input) {
        return Pattern.matches(ZIPCODE_REGEX, input);
    }
}
