public class EquilateralTriangle extends Triangle {
    // Constructor
    public EquilateralTriangle(double side) {
        super(side, side, side); // All sides are equal in an equilateral triangle
    }

    // Implementing scale method
    @Override
    public void scale(double factor) {
        super.scale(factor); // Apply scaling to all sides via Triangle's scale method
    }
}
