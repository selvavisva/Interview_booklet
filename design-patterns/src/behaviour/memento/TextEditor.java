package behaviour.memento;

public class TextEditor {
	
	private String content;
	
	public void write(String content) {
		this.content=content;
	}
	
	public String getContent() {		
		return content;
	}
	
	public EditorMemento save() {		
		return new EditorMemento(content);
	}
	
	public void restore(EditorMemento memento) {		
		content= memento.getSavedContent();
	}

}
