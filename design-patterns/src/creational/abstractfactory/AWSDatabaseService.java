package creational.abstractfactory;

public class AWSDatabaseService implements DatabaseService{

	@Override
	public void saveData() {
		System.out.println("AWS save data to dynamoDB");		
	}

}
