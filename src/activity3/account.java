
package activity3;

public class account {
    
    private  int acc_num;
    private double balance;
    
    public void setacc_num(int Acc_num){
        acc_num = Acc_num;
    }
    
    public int getacc_num(){
        return acc_num;
        
    }
    public void setbalance(double blnc){
        balance = blnc;
    }
    
    public double getbalance(){
    return balance;
}
    public void debit(double Debt){
        
        if(Debt > balance){
            
            System.out.println("sorry, we cannot cashout that ammount of money !");
        }
    
        else {
            balance = getbalance() - Debt;
            System.out.println("cashout successful, new balance: "+ balance);
        }
        
        
        
    }
    
  }  
    
    
    
    
    
    
    
    
    
    
    
    
    

