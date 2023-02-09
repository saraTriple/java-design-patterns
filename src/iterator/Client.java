package src.iterator;

public class Client {
    public static void main(String[] args) {
        MyDataStructure ownStructure = new MyDataStructure();

        for (Iterator iterator =ownStructure.getIterator(); iterator.hasNext();) {
            String employeeName = (String) iterator.next();
            System.out.println("Employee: " + employeeName);
        }
    }
}
