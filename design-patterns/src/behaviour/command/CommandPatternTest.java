package behaviour.command;

public class CommandPatternTest {
	public static void main(String[] args) {
		Light light = new Light();
		Command onCommand = new LightOnCommand(light);		
		Command offCommand = new LightOffCommand(light);
		
		RemoteControl control = new RemoteControl();
		control.setCommand(onCommand);
		control.pressButton();
		
		
		control.setCommand(offCommand);
		control.pressButton();
		
		
	}
}
