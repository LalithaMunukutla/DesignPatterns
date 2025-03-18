public class Director {
    public void constructComputer(Builder builder){
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}
