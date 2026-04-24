package behaviour.memento;

import java.util.Stack;

public class EditorHistory {
	
	Stack<EditorMemento> stack = new Stack<>();
	
	public void save(EditorMemento memento) {		
		stack.push(memento);
	}
	
	public EditorMemento undo() {		
		return stack.pop();
	}
}