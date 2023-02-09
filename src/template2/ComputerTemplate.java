package src.template2;

public abstract class ComputerTemplate {

    // Template Methods
    public final void buildComputer() { // Attention. This method should be final
        buildMotherBoard();
        buildCPU();
        buildHDD();
        buildGraphics();

    }

    // Steps To Follow
    public abstract void buildMotherBoard();
    public abstract void buildCPU();
    public abstract void buildHDD();
    public abstract void buildGraphics();

}
