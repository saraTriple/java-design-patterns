package src.command;

public class OpenTextFileOps implements TextFileOperation{
    private TextFile textFile;

    public OpenTextFileOps(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
