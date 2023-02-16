package src.memento2;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("You are learning how to implement it\n");
        textEditor.hitSave(); //Saving

        System.out.println(textEditor.print());

        textEditor.write("Hello my dear friends\n");
        System.out.println(textEditor.print());

        textEditor.hitUndo();

        System.out.println(textEditor.print());


    }
}
