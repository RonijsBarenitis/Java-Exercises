class Main {
    public static void main(String[] args) {

        String shape1Type = String.valueOf(Shapes.CIRCLE);
        Shape shape1 = ShapeFactory.getShape(Shapes.CIRCLE);
        System.out.println("Shape1: " +(shape1Type));
        shape1.draw();

        String shape2Type = String.valueOf(Shapes.CUBE);
        Shape shape2 = ShapeFactory.getShape(Shapes.CUBE);
        System.out.println("Shape2: " +(shape2Type));
        shape2.draw();

        String shape3Type = String.valueOf(Shapes.TRIANGLE);
        Shape shape3 = ShapeFactory.getShape(Shapes.TRIANGLE);
        System.out.println("Shape3: " +(shape3Type));
        shape3.draw();

    }
}