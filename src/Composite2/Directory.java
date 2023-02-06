package src.Composite2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Directory extends File {
    Set<File> files;

    public Directory(String fileName) {
        super(fileName);
        files = new TreeSet<File>();
    }

    @Override
    public String display() {
        String out = this.fileName + " \n";
        int level = 0;
        Iterator<File> iterator = files.iterator();
        while (iterator.hasNext()) {
            File file = iterator.next();

            // if it is a file:
            if (file instanceof AFile) {
                out += file.fileName + "\n";
            }

            // if it is a directory
             else if (file instanceof Directory) {
                 // Recursive function display
                 out += file.display();
            } else {
                 assert  false;
            }
        }

        return out;
    }

    public boolean addFile(File file) {
        return files.add(file);
    }

    public boolean removeFile(File file) {
        return files.remove(file);
    }

    public String[] list() {
        String[] fileNames = new String[files.size()];
        Iterator<File> filesIterator = files.iterator();
        int i = 0;
        while (filesIterator.hasNext()) {
            File file = filesIterator.next();
            fileNames[i++] = file.getFileName();
        }
        return fileNames;
    }

    public File[] listFiles() {
        return (File[]) files.toArray();
    }


}
