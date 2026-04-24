package behaviour.template;

public class CSVDataprocessor extends DataProcessor{
	@Override
	public void parseFile() {
		System.out.println("Parsing CSV file");
	}

	@Override
	public void processDataFromFile() {		
		System.out.println("Processing data from CSV file");
	}
}