package behaviour.template;

public class TemplatePatternTest {
	public static void main(String[] args) {
		
		DataProcessor processor= new CSVDataprocessor();
		processor.process("filepath");
	}
}
