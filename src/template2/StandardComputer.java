package src.template2;

public class StandardComputer extends ComputerTemplate{
    @Override
    public void buildMotherBoard() {
        System.out.println("Standard Mother Board");
    }

    @Override
    public void buildCPU() {
        System.out.println("Intel Core i7 8th Gen");
    }

    @Override
    public void buildHDD() {
        System.out.println("5TB SSD");
    }

    @Override
    public void buildGraphics() {
        System.out.println("No Graphics Card");
    }
}
