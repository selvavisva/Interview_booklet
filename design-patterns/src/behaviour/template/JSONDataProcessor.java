package behaviour.template;

public class JSONDataProcessor  extends DataProcessor{
	@Override
	public void parseFile() {
		System.out.println("Parsing JSON file");
	}

	@Override
	public void processDataFromFile() {		
		System.out.println("Processing data from JSON file");
	}
}
