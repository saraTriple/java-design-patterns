package src.template2;

public class SuperComputer extends ComputerTemplate{
    @Override
    public void buildMotherBoard() {
        System.out.println("TUF Mother Board");
    }

    @Override
    public void buildCPU() {
        System.out.println("Intel i9 12th Gen");
    }

    @Override
    public void buildHDD() {
        System.out.println("10 TB NVME");
    }

    @Override
    public void buildGraphics() {
        System.out.println("Nvidia GTX 4070");
    }
}
