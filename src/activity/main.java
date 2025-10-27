package activity;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        square obj1 = new square();
        cube obj2 = new cube();
        circle obj3 = new circle();
       
        System.out.print("Enter the length: ");
        int len = scan.nextInt();
        System.out.print("enter the radius: ");
        int rad = scan.nextInt();
        
        obj1.setLength(len);
        obj2.setLength(len);
        obj3.setraduis(rad);
      
        obj1.setArea();
        obj1.setPara();
        obj1.setName("x");
        obj1.setColor("black");
        
        obj2.setAreaCube();
        obj2.setPara();
        obj2.setCubeVol();
        obj2.setName("y");
        obj2.setColor("red");
        
        
        obj3.setcircleArea();
        obj3.setcircumference();
        obj3.setName("Z");
        obj3.setColor("blue");
        
        System.out.println("Square Details: ");
        obj1.display();
        System.out.println("*****************************************");
        System.out.println("Cube Details: ");
        obj2.displaycube();
       System.out.println("*****************************************");
        System.out.println("circle details: ");
        obj3.display_circle();
    }
}
