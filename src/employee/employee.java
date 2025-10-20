
package employee;

public class employee{
    
    private String fn;
    private String ln;
    private double monthsalary;
   
    
   public employee (String fn, String ln, double salary){
       this.fn = fn;
       this.ln = ln;
       this.monthsalary = salary ;
    
}

   
   public String getfn(){
       return fn;
   }
   public String getln(){
       return ln;
   }
    
    public double getmonthsalary(){
       return monthsalary ;
    }
    public double getyearsalary(){
        return monthsalary * 12;
    }
    
    public void raisesalary(double percent){
        if(percent > 0){
            monthsalary += monthsalary * 1.1;
        }
    }
    
    
    
    
    
    
    
    
    
}
