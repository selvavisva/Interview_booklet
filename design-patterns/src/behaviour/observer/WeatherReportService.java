package behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherReportService implements Subject{

	private int temperature;
	private List<Observer> observerList = new ArrayList<>();
	
	@Override
	public void register(Observer observer) {
		observerList.add(observer);		
	}

	@Override
	public void unRegister(Observer observer) {		
		observerList.remove(observer);
	}

	@Override
	public void notifyRegister() {
		for(Observer observer:observerList) {
			observer.updateTemperature(temperature);
		}		
	}
	
	public void setTemperature(int input) {
		this.temperature=input;
		notifyRegister();
	}
}