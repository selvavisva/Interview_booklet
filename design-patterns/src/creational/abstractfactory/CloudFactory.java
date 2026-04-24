package creational.abstractfactory;

public interface CloudFactory {
	StorageService createStorageService();
	ComputeService createComputeService();
	DatabaseService createDatabaseService();
	
}
