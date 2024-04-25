package Assignments.Assignment_6.Adapter;

public class WeatherXML {
    private double temperature;
    private double humidity;
    private double windSpeed;
    public WeatherXML(){}
    public WeatherXML(double temperature, double humidity, double windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }
    public String getForecast(){
        String forecast = "{ temperature:"+temperature+", humidity:"+humidity+", windSpeed:"+windSpeed+"}";
        return forecast;
    }
}
