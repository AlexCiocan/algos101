package main;

import java.time.LocalDate;
import java.util.Map;

import temperature.Country;
import temperature.Globe;

public class MainCountry {

	public static void main(String[] args) {
		Globe globe = new Globe();

		globe.addCountry("Romania");
		globe.addForecastForCountry("Romania", LocalDate.parse("2018-02-10"), 32.0);
		globe.addForecastForCountry("Romania", LocalDate.parse("2018-05-21"), 26.5);
		globe.addForecastForCountry("Romania", LocalDate.parse("2018-03-11"), 25.5);

		globe.addCountry("Hungary");
		globe.addForecastForCountry("Hungary", LocalDate.parse("2018-02-10"), 10.0);
		globe.addForecastForCountry("Hungary", LocalDate.parse("2018-06-21"), 24.3);
		globe.addForecastForCountry("Hungary", LocalDate.parse("2018-08-10"), 12.1);

		globe.addCountry("Germany");
		globe.addForecastForCountry("Germany", LocalDate.parse("2018-02-10"), 32.1);
		globe.addForecastForCountry("Germany", LocalDate.parse("2018-06-21"), 1.3);
		globe.addForecastForCountry("Germany", LocalDate.parse("2018-08-10"), 2.1);

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
		System.out.println("Max temp on 2018-02-10: " + globe.getMaxTemperatureForADay(LocalDate.parse("2018-02-10")));
		System.out.println("Min temp on 2018-02-10: " + globe.getMinTemperatureForADay(LocalDate.parse("2018-02-10")));
	}
}
