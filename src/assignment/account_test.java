
package assignment;

public class account_test {
    public static void main(String[] args) {
        account obj1 = new account(109, 600);
        account obj2 = new account (110, 500);
        
        System.out.println("current account details: ");
        obj1.display();
        obj2.display();
        System.out.println("*******************************");
        System.out.println("\t transaction");
        obj1.setDeposit(150);
         obj1.setdebit(200);
         
        
        obj2.setDeposit(200);
        obj2.setdebit(140);
        
        System.out.println(" updated account details: ");
        obj1.display();
        obj2.display();
        
    }
}
