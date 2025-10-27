package activity;

public class circle extends shape {
    private int circumference;
    private int surfaceArea;
    
    public void setcircumference() {
        this.circumference = (int) (2 * Math.PI * super.r);
    }
    
    public void setcircleArea() {
   this.surfaceArea = (int) (Math.PI * Math.pow(super.r, 2));

    }
    
    public int getcircumference() {
        return circumference;
    }
    
    public int getcircleArea() {
        return surfaceArea;
    }
    
    public void display_circle() {
        System.out.println("name of the circle: " + getName());
        System.out.println("color of the circle: " + getColor());
        System.out.println("circumference: " + getcircumference());
        System.out.println("surface area: " + getcircleArea());
    }
}
