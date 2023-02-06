package src.Composite2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public abstract class File implements Comparable<Object>{
    String fileName;
    Set<FileAttributey> fileAttributes;

    public File(String fileName) {
        this.fileName = fileName;
        this.fileAttributes = new TreeSet<FileAttributey>();
    }

    public Set<FileAttributey> getFileAttributes() {
        return fileAttributes;
    }

    public FileAttributey getFileAttribute(Attributey attributey) {
        if (!fileAttributes.isEmpty()) {
            Iterator<FileAttributey> iterator = fileAttributes.iterator();
            while (iterator.hasNext()) {
                FileAttributey fileAttributey = iterator.next();
                if (fileAttributey.equals(attributey)) {
                    return  fileAttributey;
                }
            }
        }
        return null;
    }

    public String getFileName() {
        return fileName;
    }

    public void addFileAttribute(FileAttributey fileAttributey) {
        fileAttributes.add(fileAttributey);
    }

    public void removeFileAttribute(FileAttributey fileAttributey) {
        fileAttributes.remove(fileAttributey);
    }

    @Override
    public int compareTo(Object o) {
        File objectFile = (File) o;
        return fileName.compareTo(objectFile.fileName);
    }

    public abstract String display();
}
