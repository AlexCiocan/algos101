package temperature;

import java.util.List;
import java.util.Map;

public class Weather {

	private List<Map<String, Object>> current_condition;
	private List<Map<String, Object>> weather;
	
	public List<Map<String, Object>> getCurrent_condition() {
		return current_condition;
	}
	public void setCurrent_condition(List<Map<String, Object>> current_condition) {
		this.current_condition = current_condition;
	}
	public List<Map<String, Object>> getWeather() {
		return weather;
	}
	public void setWeather(List<Map<String, Object>> weather) {
		this.weather = weather;
	}
	
}
