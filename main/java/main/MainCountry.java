package main;

import java.time.LocalDate;
import java.util.Map;

import temperature.Country;
import temperature.WeatherParser;
import temperature.Globe;

public class MainCountry {

	public static void main(String[] args) {
		WeatherParser weatherParser = new WeatherParser();
		
		Globe globe = new Globe();

		globe.addCountry(weatherParser.getForecast("Munich"));

		globe.addCountry(weatherParser.getForecast("London"));

		globe.addCountry(weatherParser.getForecast("Amsterdam"));

		for (Country country : globe.getCountryList()) {
			for (Map.Entry<LocalDate, Double> entry : country.getTemperatures().entrySet()) {
				System.out.println(country.getName() + " " + entry.getKey() + " " + entry.getValue());
			}
			System.out.println();
		}

		for (Country country : globe.getCountryList()) {
			System.out.println("Max temp in " + country.getName() + ": " + country.getMaxTemperature());
			System.out.println("Min temp in " + country.getName() + ": " + country.getMinTemperature());
			System.out.println();
		}

		System.out.println();
		System.out.println("Max temp on the globe: " + globe.getMaxTemperature());
		System.out.println("Min temp on the globe: " + globe.getMinTemperature());

		System.out.println();
		System.out.println("Todays max temp (" + LocalDate.now()  + "): " + globe.getMaxTemperatureForADay(LocalDate.now()));
		System.out.println("Todays min temp (" + LocalDate.now()  + "): " + globe.getMinTemperatureForADay(LocalDate.now()));
	}
}
