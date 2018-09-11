package temperature;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Country {

	private HashMap<LocalDate, Double> temperatures;
	private String name;

	public Country(String name) {
		temperatures = new HashMap<>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void putForecast(LocalDate date, Double temperature) {
		temperatures.put(date, temperature);
	}

	public Double getForecast(LocalDate date) {
		return temperatures.get(date);
	}

	public Double getMaxTemperatureForADay(LocalDate date) {
		Double max = Double.MIN_VALUE;

		for (Map.Entry<LocalDate, Double> entry : temperatures.entrySet()) {
			if (entry.getKey().getDayOfYear() == date.getDayOfYear()) {
				if (max.compareTo(entry.getValue()) < 0) {
					max = entry.getValue();
				}
			}
		}

		return max;
	}

	public Double getMinTemperatureForADay(LocalDate date) {
		Double min = Double.MAX_VALUE;

		for (Map.Entry<LocalDate, Double> entry : temperatures.entrySet()) {
			if (entry.getKey().getDayOfYear() == date.getDayOfYear()) {
				if (min.compareTo(entry.getValue()) > 0) {
					min = entry.getValue();
				}
			}
		}

		return min;
	}

	public Double getMaxTemperature() {
		Double max = Double.MIN_VALUE;

		for (Map.Entry<LocalDate, Double> entry : temperatures.entrySet()) {
			if (max.compareTo(entry.getValue()) < 0) {
				max = entry.getValue();
			}
		}

		return max;
	}

	public Double getMinTemperature() {
		Double min = Double.MAX_VALUE;

		for (Map.Entry<LocalDate, Double> entry : temperatures.entrySet()) {
			if (min.compareTo(entry.getValue()) > 0) {
				min = entry.getValue();
			}
		}

		return min;
	}
	
	public HashMap<LocalDate, Double> getTemperatures() {
		return temperatures;
	}
}
