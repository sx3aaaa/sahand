
package assignment;

public class account {
    
    private double balance;
    private final int ID;
    
    public account ( int ID, double balance1){
        this.ID = ID;
        if(balance1 > 0){
            this.balance = balance1; 
        }
        else
            this.balance = 0;
    }
    
    
    public int getID(){
        return ID;
    }
    
    public double balance(){
        return balance;
    }
    
    public void setDeposit(double amount){
        if (amount > 0){
            balance +=amount;
            System.out.println("deposit :"+ amount);
        }
    }
    
    public void setdebit(double ammount){
        if (ammount > balance) {
            System.out.println("the ammount is bigger than the actual balance, try differ ammount");
            
        }
        else if (ammount > 0) {
            balance -=ammount;
            System.out.println("debited : "+ ammount);
        }
        else
            System.out.println(" the ammount must be positive ");
    }
    public void display(){
        System.out.println("ID : "+ ID);
        System.out.println("current balance : "+ balance + " $");
    }
}
