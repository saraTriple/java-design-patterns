package src.command;

public class SaveTextFileOps implements TextFileOperation{
    private TextFile textFile;

    public SaveTextFileOps(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
