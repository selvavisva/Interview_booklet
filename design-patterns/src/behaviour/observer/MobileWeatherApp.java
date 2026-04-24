package behaviour.observer;

public class MobileWeatherApp implements Observer{
	public void updateTemperature(int input) {
		System.out.println("Mobile Weather App :: Temperature now is :: "+input);
	}	
}
