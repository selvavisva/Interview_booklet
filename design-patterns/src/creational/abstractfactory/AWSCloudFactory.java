package creational.abstractfactory;

public class AWSCloudFactory implements CloudFactory{

	@Override
	public StorageService createStorageService() {
		return new AWSStorageService();
	}

	@Override
	public ComputeService createComputeService() {
		return new AWSComputeService();
	}

	@Override
	public DatabaseService createDatabaseService() {
		return new AWSDatabaseService();
	}
}