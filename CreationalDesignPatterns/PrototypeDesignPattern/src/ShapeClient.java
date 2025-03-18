public class ShapeClient {
    private Shape shapePrototype;
    public ShapeClient(Shape shapePrototype){
        this.shapePrototype = shapePrototype;
    }
    public Shape getShape(){
        return shapePrototype.clone();
    }
}
