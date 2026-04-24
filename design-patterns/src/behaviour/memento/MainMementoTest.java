package behaviour.memento;

public class MainMementoTest {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.write("Version 1");
		
		EditorHistory history = new EditorHistory();
		history.save(editor.save());
		
		editor.write("Version 2");
		
		System.out.println(editor.getContent());
		
		editor.restore(history.undo());
		
		System.out.println(editor.getContent());
	}

}
