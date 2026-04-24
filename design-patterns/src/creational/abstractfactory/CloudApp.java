package creational.abstractfactory;

public class CloudApp {
	
	private StorageService storageService;
	private ComputeService computeService;
	private DatabaseService databaseService;
	
	public CloudApp(CloudFactory factory) {		
		this.storageService=factory.createStorageService();
		this.computeService=factory.createComputeService();
		this.databaseService=factory.createDatabaseService();
	}
	
	public void run() {		
		storageService.storeFile("filePath");
		computeService.computeVM();
		databaseService.saveData();
	}
}
