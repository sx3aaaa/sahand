package shape;

public class rectangle extends shape {

    private int area;
    private int perimeter;

    public rectangle(int x, int y) {
        super(x, y);
    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    @Override
    public int Area() {
        this.area = getX() * getY();
        return area;
    }

    @Override
    public int Perimeter() {
        this.perimeter = 2 * (getX() + getY());
        return perimeter;
    }

    @Override
    public void draw() {
        System.out.println("Area is " + Area());
        System.out.println("Perimeter is " + Perimeter());
    }
}
