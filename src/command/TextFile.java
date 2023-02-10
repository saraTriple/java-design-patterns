package src.command;

// Receiver Class
public class TextFile {

    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    public String save() {
        return "Saving File " + fileName;
    }

    public String open() {
        return "Opening File " + fileName;
    }
}
