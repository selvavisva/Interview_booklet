package behaviour.observer;

public class ObserverPatternTest {
	public static void main(String[] args) {
		WeatherReportService service = new WeatherReportService();
		
		MobileWeatherApp app1 = new MobileWeatherApp();
		PCWeatherApp app2 = new PCWeatherApp();
		service.register(app1);
		service.register(app2);
		
		//service.unRegister(app2);
		
		service.setTemperature(28);
		
	}

}
