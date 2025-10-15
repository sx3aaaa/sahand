
package activity3;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class account_ {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        account obj = new account();
        
        obj.setbalance(5000000);
        System.out.println("balance: "+obj.getbalance());
        System.out.println("please enter the ammount to cashout: ");
        int csh = scan.nextInt();
        obj.debit(csh);
        TimeUnit.SECONDS.sleep(4);
        System.out.println("balance is: "+obj.getbalance());
        
        
        
        
        
    }
    
}
