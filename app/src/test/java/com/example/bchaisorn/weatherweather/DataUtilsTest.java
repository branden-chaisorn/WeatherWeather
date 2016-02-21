package com.example.bchaisorn.weatherweather;



import com.example.bchaisorn.weatherweather.Utils.DataUtils;

import junit.framework.TestCase;

import org.junit.Test;

public class DataUtilsTest extends TestCase {

    @Test
    public void testValidFiveCharacterZipCode() {
        assertTrue(DataUtils.isValidZipCode("78752"));
    }

    @Test
    public void testValidTenCharacterZipCode() {
        assertTrue(DataUtils.isValidZipCode("78752-2939"));
    }

    @Test
    public void testInValidFiveCharacterZipCode() {
        assertFalse(DataUtils.isValidZipCode("787523"));
    }

    @Test
    public void testInValidNonNumericZipCode() {
        assertFalse(DataUtils.isValidZipCode("djdnn"));
    }
}