package com.example;

public class App {

    // Module 1: Search Location
    public String searchLocation(String location) {
        return "Location searched: " + location;
    }

    // Module 2: View Current Weather
    public String viewCurrentWeather(String location) {
        return "Current weather for " + location;
    }

    // Module 3: View Weather Forecast
    public String viewWeatherForecast(String location) {
        return "Weather forecast for " + location;
    }

    // Module 4: Refresh Weather Data
    public String refreshWeatherData(String location) {
        return "Weather data refreshed for " + location;
    }

    // Weather API
    public String weatherApi(String location) {
        return "Weather API called for " + location;
    }

    public static void main(String[] args) {

        App app = new App();

        String location = "Chennai";

        System.out.println(app.searchLocation(location));
        System.out.println(app.viewCurrentWeather(location));
        System.out.println(app.viewWeatherForecast(location));
        System.out.println(app.refreshWeatherData(location));
        System.out.println(app.weatherApi(location));
    }
}