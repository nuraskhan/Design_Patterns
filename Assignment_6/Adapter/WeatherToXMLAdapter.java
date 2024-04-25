package Assignments.Assignment_6.Adapter;

public class WeatherToXMLAdapter extends WeatherJSON{
    private WeatherJSON weatherJSON;

    public WeatherToXMLAdapter(WeatherJSON weatherJSON){
        this.weatherJSON=weatherJSON;
    }
    @Override
    public String getForecast(){
        String forecast=weatherJSON.getForecast();
        // transforming , logic
        return forecast;
    }

}
