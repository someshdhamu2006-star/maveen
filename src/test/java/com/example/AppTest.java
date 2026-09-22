package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSearchLocation() {
        App app = new App();
        assertEquals("Location searched: Chennai",
                     app.searchLocation("Chennai"));
    }

    @Test
    public void testCurrentWeather() {
        App app = new App();
        assertEquals("Current weather for Chennai",
                     app.viewCurrentWeather("Chennai"));
    }

    @Test
    public void testWeatherForecast() {
        App app = new App();
        assertEquals("Weather forecast for Chennai",
                     app.viewWeatherForecast("Chennai"));
    }

    @Test
    public void testRefreshWeatherData() {
        App app = new App();
        assertEquals("Weather data refreshed for Chennai",
                     app.refreshWeatherData("Chennai"));
    }

    @Test
    public void testWeatherApi() {
        App app = new App();
        assertEquals("Weather API called for Chennai",
                     app.weatherApi("Chennai"));
    }
}