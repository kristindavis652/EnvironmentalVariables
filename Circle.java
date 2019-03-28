public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public boolean isBiggerThan(Rectangle other) {
        return this.computeArea() > other.computeArea();
    }

}
