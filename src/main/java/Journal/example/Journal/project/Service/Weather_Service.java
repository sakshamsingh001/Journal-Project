package Journal.example.Journal.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Weather_Service {
    private static final String APIkey=" aef7ea2bc6e95ca8b8ace0afdeb156e2";
    private static final String API="https://api.weatherstack.com/current?access_key=API_KEY&querry=CITY" ;

    @Autowired
    private RestTemplate restTemplate;
private String getWeather(String city){
    String finalAPI=API.replace("CITY", city).replace("API_KEY" ,API);
restTemplate.exchange(finalAPI, HttpMethod.GET,null,WeatherResponse.class);

}


}
