public class Demo {
    public static void main(String[] args) {
        // Creating an array of Scalable objects
        Scalable[] shapes = new Scalable[4];

        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(6, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(4);

        // Printing original shapes
        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scaling all shapes by a factor of 2
        scaleShapes(shapes, 2);

        // Printing scaled shapes
        System.out.println("\nAfter Scaling by factor of 2:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    // Method to scale all objects in an array
    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}
