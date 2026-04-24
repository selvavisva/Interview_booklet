package creational.abstractfactory;

public class AWSStorageService implements StorageService {

	@Override
	public void storeFile(String path) {
		System.out.println("AWS storage stored the file");
	}

}
