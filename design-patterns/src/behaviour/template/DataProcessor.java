package behaviour.template;

public abstract class DataProcessor {
	
	public final void process(String path) {		
		openFile(path);
		parseFile();
		processDataFromFile();
		saveData();
		closeFile();
	}
	
	public void openFile(String path) {
		System.out.println("Open file");		
	}
	
	public abstract void parseFile();
	
	public abstract void processDataFromFile();
	
	public void saveData() {
		System.out.println("saving data");		
	}
	
	public void closeFile() {
		System.out.println("Close file");
	}

}
