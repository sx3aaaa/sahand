package shape;

public class circle extends shape {

    private double radius;

    public circle(double radius) {
        super(0, 0);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int Area() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public int Perimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public void draw() {
        System.out.println("Area is " + Area());
        System.out.println("Perimeter is " + Perimeter());
    }
}
