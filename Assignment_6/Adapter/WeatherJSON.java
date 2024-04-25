package Assignments.Assignment_6.Adapter;

public class WeatherJSON {
    private double temperature;
    private double humidity;
    private double windSpeed;
    public WeatherJSON(){};
    public WeatherJSON(double temperature, double humidity, double windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }
    public String getForecast(){
        String forecast = "<temperature>"+temperature+"<temperature/>\n<humidity>"+humidity+"</humidity>\n<windSpeed>"+windSpeed+"</windSpeed>";
        return forecast;
    }
}
