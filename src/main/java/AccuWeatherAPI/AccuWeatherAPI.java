package AccuWeatherAPI;

import java.util.Map;

public interface AccuWeatherAPI {
  Map<String, Object> getWeather(String location);

}