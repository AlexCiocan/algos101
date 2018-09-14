package temperature;

import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class CountryParser {

	JsonObject jsonObject;
	
	public Country getForecast(String countryName) {
		
		// Get the JSON information for "countryName"
		TemperatureAPI temperatureAPI = new TemperatureAPI();
		String response = temperatureAPI.getForecastForCity(countryName).toString();
		Country country = new Country(countryName);
		
		// Parse the JSON
		Gson gson = new Gson();
		jsonObject = gson.fromJson(response, JsonObject.class);
		
		country.putForecast(LocalDate.now(), getTodayTemperature());
		country.putForecast(getDate(0), getTemperature(0));
		country.putForecast(getDate(1), getTemperature(1));
		country.putForecast(getDate(2), getTemperature(2));
		country.putForecast(getDate(3), getTemperature(3));
		country.putForecast(getDate(4), getTemperature(4));
		
		return country;
	}
	
	private Double getTodayTemperature() {
		return jsonObject.get("data").getAsJsonObject().get("current_condition").getAsJsonArray().get(0).getAsJsonObject().get("temp_C").getAsDouble();
	}
	
	// from 0 to 4
	private LocalDate getDate(int pos) {
		return LocalDate.parse((jsonObject.get("data").getAsJsonObject().get("weather").getAsJsonArray().get(pos).getAsJsonObject().get("date").getAsString()));
	}
	
	// from 0 to 4
	private Double getTemperature(int pos) {
		Double max = jsonObject.get("data").getAsJsonObject().get("weather").getAsJsonArray().get(pos).getAsJsonObject().get("maxtempC").getAsDouble();
		Double min = jsonObject.get("data").getAsJsonObject().get("weather").getAsJsonArray().get(pos).getAsJsonObject().get("mintempC").getAsDouble();
		return (min + max) / 2;
	}
	
}
