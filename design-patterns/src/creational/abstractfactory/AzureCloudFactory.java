package creational.abstractfactory;

public class AzureCloudFactory implements CloudFactory{

	@Override
	public StorageService createStorageService() {
		return new AzureStorageService();
	}

	@Override
	public ComputeService createComputeService() {
		return new AzureComputeService();
	}

	@Override
	public DatabaseService createDatabaseService() {
		return new AzureDatabaseService();
	}
}