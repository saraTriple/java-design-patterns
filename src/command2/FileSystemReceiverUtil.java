package src.command2;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Current OS is " + osName);

        if (osName.contains("Windows")) {
            return new Windows();
        } else {
            return new Linux();
        }
    }
}
