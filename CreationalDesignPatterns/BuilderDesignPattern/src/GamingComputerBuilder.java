public class GamingComputerBuilder implements Builder{
    Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.setCpu("Gaming CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRam("Gaming RAM");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("Gaming storage");
    }

    @Override
    public void getResult() {
        System.out.println(computer.toString());
    }
}
