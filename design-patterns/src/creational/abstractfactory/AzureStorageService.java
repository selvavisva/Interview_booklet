package creational.abstractfactory;

public class AzureStorageService implements StorageService {

	@Override
	public void storeFile(String path) {
		System.out.println("Azure storage stored the file");
	}

}
