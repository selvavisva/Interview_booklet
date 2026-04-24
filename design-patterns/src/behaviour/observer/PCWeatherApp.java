package behaviour.observer;

public class PCWeatherApp implements Observer{
	public void updateTemperature(int input) {
		System.out.println("PC Weather App :: Temperature now is :: "+input);
	}
}