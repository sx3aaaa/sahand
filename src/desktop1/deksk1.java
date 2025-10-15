
package desktop1;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class deksk1 {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner input = new Scanner (System.in);
        desktop obj = new desktop();
       
        System.out.print("enter the laptops processor: ");
        String P = input.nextLine();
        obj.setProcessor (P);
        
        System.out.print("enter the Brand: ");
        String Br =  input.nextLine();
        obj.setBrand(Br);
        
        System.out.print("enter the Ram size: ");
        double R= input.nextDouble();
        obj.setRam(R);
      
      
      
        System.out.println("heres your laptop info: ");
        System.out.println("processor: "+obj.getprocessor());
        System.out.println("Ram size: "+obj.getRam());
        System.out.println("Brand: "+obj.getBrand());
        TimeUnit.SECONDS.sleep(2);
        
        
        while(true){
          System.out.print("do you want to upgrade the Ram size? ");
        String ans = input.next();
        if(ans.equals("yes")){
             System.out.print("how much do u want to add? ");
            int add = input.nextInt(); 
            obj.setUpgradedRam(add);
         
            System.out.println("the upgraded ram is : "+obj.getUpgradedRam());
        
        }
        else{
            
            System.out.println("Closing the prgram, good Bye!");
            TimeUnit.SECONDS.sleep(2);
           break;
        }
       
        }
        
    
        
        
        
        
    }
    
}
