package creational.abstractfactory;

public class ClientApp {
	
	public static void main(String[] args) {
		
		String cloudType = "AWS";
		CloudFactory factory=null;		
		if(cloudType.equals("AWS")) {
			factory = new AWSCloudFactory();
		}		
		CloudApp app = new CloudApp(factory);
		app.run();
		
	}

}
