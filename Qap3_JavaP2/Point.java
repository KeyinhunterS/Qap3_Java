public class Point {
    private float x;
    private float y;

    // Constructors
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0.0f, 0.0f); // Default values
    }

    // Getters and Setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[] { x, y };
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
