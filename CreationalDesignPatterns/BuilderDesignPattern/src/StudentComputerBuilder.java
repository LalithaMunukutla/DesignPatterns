public class StudentComputerBuilder implements Builder{
    Computer computer = new Computer();

    @Override
    public void buildCPU() {
       computer.setCpu("Student CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRam("Student RAM");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("Student storage");
    }

    @Override
    public void getResult() {
        System.out.println(computer.toString());
    }
}
