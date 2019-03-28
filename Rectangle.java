public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length; //this. is not necessary here but it may make it more clear

    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public double computeArea() {
        return this.length * this.width;
    }

    public boolean isBiggerThan(Rectangle other) {
        return this.computeArea() > other.computeArea();
    }

    public boolean isBiggerThan(Circle other) {
        return this.computeArea() > other.computeArea();
    }

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(2, 4);
        System.out.println(r1.computeArea()); //r1 is the instance
        Rectangle r2 = new Rectangle(3, 5);
        System.out.println(r2.computeArea());

        System.out.println(r1.isBiggerThan(r2));
        System.out.println(r2.isBiggerThan(r1));

        Circle c = new Circle(2);
        r1.isBiggerThan(c);
        c.isBiggerThan(r1);

        System.out.println(r1.isBiggerThan(c));
        System.out.println(c.isBiggerThan(r1));


    }
}
