
package com.example;

public class App {

    public String searchLocation(String location) {
        return "Location searched: " + location;
    }

    public String viewCurrentWeather(String location) {
        return "Current weather for " + location;
    }

    public String viewWeatherForecast(String location) {
        return "Weather forecast for " + location;
    }

    public String refreshWeatherData(String location) {
        return "Weather data refreshed for " + location;
    }

    public String weatherApi(String location) {
        return "Weather API called for " + location;
    }

    public static void main(String[] args) throws InterruptedException {
        App app = new App();
        String location = "Chennai";

        System.out.println(app.searchLocation(location));
        System.out.println(app.viewCurrentWeather(location));
        System.out.println(app.viewWeatherForecast(location));
        System.out.println(app.refreshWeatherData(location));
        System.out.println(app.weatherApi(location));

        // Keep the application running for Kubernetes.
        while (true) {
            Thread.sleep(60000);
        }
    }
}
