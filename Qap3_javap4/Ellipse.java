public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    // Constructor
    public Ellipse(double a, double b) {
        super("Ellipse");
        // Assigning the larger value to majorAxis and smaller to minorAxis
        if (a >= b) {
            this.majorAxis = a;
            this.minorAxis = b;
        } else {
            this.majorAxis = b;
            this.minorAxis = a;
        }
    }

    // Implementing abstract methods
    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (Math.sqrt(2 * (majorAxis * majorAxis + minorAxis * minorAxis))
                - (Math.pow(majorAxis - minorAxis, 2) / 2));
    }

    // Implementing scale method
    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }
}
