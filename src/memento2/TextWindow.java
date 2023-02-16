package src.memento2;

// Originator
public class TextWindow {
    // holds the currently entered text, adding more text
    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    // Adding Text
    public void addText(String text) {
        currentText.append(text);
    }


    // save the memento
    public TextWindowMemento save() {
        return new TextWindowMemento(currentText.toString());
    }

    // Restoring the memnto
    public void restore(TextWindowMemento save) {
        currentText = new StringBuilder(save.getText());
    }

    public String getCurrentText() {
        return currentText.toString();
    }
}
