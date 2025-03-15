public class Demo {
    public static void main(String[] args) {
        // Creating an array of Shape objects
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(6, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(4);

        // Looping through the array to display details
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
