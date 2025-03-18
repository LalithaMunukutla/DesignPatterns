//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape c1 = new Circle("red");
        c1.draw();
        ShapeClient sc = new ShapeClient(c1);
        Shape c2 = sc.getShape();
        c2.draw();
    }
}