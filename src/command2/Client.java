package src.command2;

public class Client {

    public static void main(String[] args) {
         // 1- Receiver
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();


        // 2- Command :
        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);
        SaveFileCommand saveFileCommand = new SaveFileCommand(fileSystemReceiver);
        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);

        // 3- Receiver
        FileInvoker fileInvokerOpen = new FileInvoker(openFileCommand);
        FileInvoker fileInvokerSave = new FileInvoker(saveFileCommand);
        FileInvoker fileInvokerClose = new FileInvoker(closeFileCommand);

        fileInvokerOpen.execute();
        fileInvokerSave.execute();
        fileInvokerClose.execute();
    }
}
