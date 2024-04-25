package Assignments.Assignment_6.Adapter;

public class WeatherToJSONAdapter extends WeatherXML{
    private WeatherXML weatherXML;

    public WeatherToJSONAdapter(WeatherXML weatherXML){
        this.weatherXML = weatherXML;
    }
    @Override
    public String getForecast(){
        String forecast=weatherXML.getForecast();
        // transforming , logic
        return forecast;
    }

}
