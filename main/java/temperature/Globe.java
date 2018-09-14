package temperature;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Globe {

	private Set<Country> countries;

	public Globe() {
		countries = new HashSet<>();
	}

	public void addCountry(Country country) {
		if (!containsCountryName(country.getName()))
			countries.add(country);
	}

	public void addForecastForCountry(String name, LocalDate date, Double temperature) {
		for (Country country : countries) {
			if (country.getName().equals(name)) {
				country.putForecast(date, temperature);
			}
		}
	}

	public boolean containsCountryName(String name) {
		for (Country country : countries) {
			if (country.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public Double getMaxTemperatureForADay(LocalDate date) {
		Double max = Double.MIN_VALUE;

		for (Country country : countries) {
			if (max.compareTo(country.getMaxTemperatureForADay(date)) < 0)
				max = country.getMaxTemperatureForADay(date);
		}

		return max;
	}

	public Double getMinTemperatureForADay(LocalDate date) {
		Double min = Double.MAX_VALUE;

		for (Country country : countries) {
			if (min.compareTo(country.getMaxTemperatureForADay(date)) > 0)
				min = country.getMaxTemperatureForADay(date);
		}

		return min;
	}

	public Double getMinTemperature() {
		Double min = Double.MAX_VALUE;

		for (Country country : countries) {
			if (min.compareTo(country.getMinTemperature()) > 0)
				min = country.getMinTemperature();
		}

		return min;
	}

	public Double getMaxTemperature() {
		Double max = Double.MIN_VALUE;

		for (Country country : countries) {
			if (max.compareTo(country.getMaxTemperature()) < 0)
				max = country.getMaxTemperature();
		}

		return max;
	}

	public Set<Country> getCountryList() {
		return countries;
	}
}
