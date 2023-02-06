package src.Composite2;

public class AFile extends File{
    public AFile(String fileName) {
        super(fileName);
    }

    @Override
    public String display() {
        return fileName;
    }
}
