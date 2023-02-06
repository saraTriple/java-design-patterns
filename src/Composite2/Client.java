package src.Composite2;

public class Client {

    public static void main(String[] args) {
        File[] files = new File[20];

        files[0] = new Directory("Root");
        files[1] = new Directory("My Documents");
        files[2] = new Directory("Maths");
        files[3] = new AFile("primary-numbers.txt");
        files[4] = new AFile("odd-numbers.txt");

        // Link and creating Hierarchy
        ((Directory) files[0]).addFile(files[1]);
        ((Directory) files[1]).addFile(files[2]);

        ((Directory) files[2]).addFile(files[3]);
        ((Directory) files[2]).addFile(files[4]);

        // Displaying the hierarchy
        System.out.print(files[0].display());

     }
}
