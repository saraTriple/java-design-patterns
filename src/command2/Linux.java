package src.command2;

public class Linux implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening File in Linux");
    }

    @Override
    public void saveFile() {
        System.out.println("Saving File in Linux");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File in Linux");
    }
}
