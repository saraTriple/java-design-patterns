package src.interpreter2;

public class Row {

    private String name;
    private String lastName;

    public Row(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String toString() {
        return name + " " + lastName;
    }
}
