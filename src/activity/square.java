package activity;


public class square extends shape {
    private int par;
  
    
    public void setArea() {
        super.Area =  length * length;
    }
    
    public int getArea() {
        return Area;
    }
    
    public void setPara() {
        this.par = 4 * length;
    }
    
    public int getPara() {
        return par;
    }
    
    public void display() {
         System.out.println("name of the square: "+getName());
        System.out.println("color of the square: "+getColor());
        System.out.println("Area of the square: " + getArea());
        System.out.println("Perimeter of the square: " + getPara());
    }

    

 
}
