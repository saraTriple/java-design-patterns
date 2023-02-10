package src.command2;

public class SaveFileCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;

    public SaveFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.saveFile();
    }
}
