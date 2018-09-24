package temperature;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherParser {

	private ObjectMapper objectMapper;
	private Weather weather;

	public Country getForecast(String countryName) {

		// Get the JSON information for "countryName"
		TemperatureAPI temperatureAPI = new TemperatureAPI();
		objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		try {
			Map<String, Weather> weathers = objectMapper.readValue(temperatureAPI.getForecastForCity(countryName),
					new TypeReference<Map<String, Weather>>() {
					});
			weather = weathers.get("data");
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Country country = new Country(countryName);

		country.putForecast(LocalDate.now(), getTodayTemperature());
		country.putForecast(getDate(0), getTemperature(0));
		country.putForecast(getDate(1), getTemperature(1));
		country.putForecast(getDate(2), getTemperature(2));
		country.putForecast(getDate(3), getTemperature(3));
		country.putForecast(getDate(4), getTemperature(4));

		return country;
	}

	private Double getTodayTemperature() {
		return Double.valueOf(weather.getCurrent_condition().get(0).get("temp_C").toString());
	}

	// // from 0 to 4
	private LocalDate getDate(int pos) {
		return LocalDate.parse(weather.getWeather().get(pos).get("date").toString());
	}

	// // from 0 to 4
	private Double getTemperature(int pos) {
		Double max = Double.valueOf(weather.getWeather().get(pos).get("maxtempC").toString());;
		Double min = Double.valueOf(weather.getWeather().get(pos).get("mintempC").toString());;
		return (min + max) / 2;
	}

}
