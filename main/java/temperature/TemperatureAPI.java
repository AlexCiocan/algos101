package temperature;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class TemperatureAPI {
	
	private final String URL = "http://api.worldweatheronline.com/premium/v1/weather.ashx?key=b36c11d541e74598bfe83829181409&q={city}&format=json&num_of_days=5";
	private RestTemplate restTemplate;
	
	public TemperatureAPI() {
		this.restTemplate = new RestTemplate();
	}
	
	public String getForecastForCity(String city) {
		Map<String, String> params = new HashMap<>();
		params.put("city", city);
		
		return restTemplate.getForEntity(URL, String.class, params).getBody().toString();
	}

}
