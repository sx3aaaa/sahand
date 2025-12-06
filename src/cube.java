package shape;

public class cube extends shape {

    private int height;

    public cube(int x, int y, int height) {
        super(x, y);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int Area() {
        return getX() * getY() * height;
    }

    @Override
    public int Perimeter() {
        return 4 * (getX() + getY() + height);
    }

    @Override
    public void draw() {
        System.out.println("Volume is " + Area());
        System.out.println("Total Edge Length is " + Perimeter());
    }
}
