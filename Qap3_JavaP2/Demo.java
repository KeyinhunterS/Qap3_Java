public class Demo {
    public static void main(String[] args) {
        // Testing Point class
        Point p1 = new Point(2.5f, 3.5f);
        System.out.println("Point: " + p1);

        // Testing MovablePoint class
        MovablePoint mp1 = new MovablePoint(2.5f, 3.5f, 1.0f, 1.5f);
        System.out.println("MovablePoint before move: " + mp1);

        // Move the point
        mp1.move();
        System.out.println("MovablePoint after move: " + mp1);
    }
}
