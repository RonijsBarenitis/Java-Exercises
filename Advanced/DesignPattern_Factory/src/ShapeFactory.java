public class ShapeFactory {

    public static Shape getShape(Shapes shape){
        if (shape == Shapes.CIRCLE){
            return new Circle();
        } else if (shape == Shapes.CUBE) {
            return new Cube();
        } else if (shape == Shapes.TRIANGLE) {
            return new Triangle();
        }
        return null;
    }
}
