package src.Composite2;

public class FileAttributey implements Comparable{
    Attributey attributey;
    String value;

    public FileAttributey(Attributey attributey, String value) {
        this.attributey = attributey;
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        FileAttributey fileAttributey = (FileAttributey) o;
        return this.attributey.getAttributeName()
                .compareTo((fileAttributey.attributey.getAttributeName()));
    }
}
