package main;

import java.time.LocalDate;
import java.util.Map;

import temperature.Country;
import temperature.CountryParser;
import temperature.Globe;

public class MainCountry {

	public static void main(String[] args) {
		CountryParser countryParser = new CountryParser();
		
		Globe globe = new Globe();

		globe.addCountry(countryParser.getForecast("Munich"));

		globe.addCountry(countryParser.getForecast("London"));

		globe.addCountry(countryParser.getForecast("Amsterdam"));

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
		System.out.println("Max temp on 2018-02-10: " + globe.getMaxTemperatureForADay(LocalDate.parse("2018-09-18")));
		System.out.println("Min temp on 2018-02-10: " + globe.getMinTemperatureForADay(LocalDate.parse("2018-09-18")));
	}
}
