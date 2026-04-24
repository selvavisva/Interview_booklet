package creational.abstractfactory;

public class AzureDatabaseService implements DatabaseService{

	@Override
	public void saveData() {
		System.out.println("Azure save data to dynamoDB");		
	}

}
