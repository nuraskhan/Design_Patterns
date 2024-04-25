package Assignments.Assignment_6.Adapter;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather(25.5, 60.0, 10.0);
        WeatherToJSONAdapter jsonAdapter = new WeatherToJSONAdapter(new WeatherXML(weather.getTemperature(), weather.getHumidity(), weather.getWindSpeed()));
        WeatherToXMLAdapter xmlAdapter = new WeatherToXMLAdapter(new WeatherJSON(weather.getTemperature(), weather.getHumidity(), weather.getWindSpeed()));

        String jsonForecast = jsonAdapter.getForecast();
        String xmlForecast = xmlAdapter.getForecast();

        System.out.println("JSON Forecast:");
        System.out.println(jsonForecast);

        System.out.println("\nXML Forecast:");
        System.out.println(xmlForecast);
    }
}
