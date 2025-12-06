package shape;

public class main {
    public static void main(String[] args) {

        rectangle r = new rectangle(4, 5);
        r.draw();

        circle c = new circle(7);
        c.draw();

        cube cb = new cube(3, 4, 5);
        cb.draw();
    }
}
