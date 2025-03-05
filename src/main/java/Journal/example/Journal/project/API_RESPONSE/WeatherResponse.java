package Journal.example.Journal.project.API_RESPONSE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.tools.javac.Main;

import java.util.List;

public class WeatherResponse {
    private Current current;
    public class Current {
        private int temp;
        @JsonProperty("weather_description")
        private List<String>;
        private int feelslike;
    }
}
