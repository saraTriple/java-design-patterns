package src.command2;

public class Windows implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening File in Windows");
    }

    @Override
    public void saveFile() {
        System.out.println("Saving File in Windows");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File in Windows");
    }
}
