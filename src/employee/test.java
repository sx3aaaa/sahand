
package employee;

public class test {
    
    public static void main(String[] args) {
       employee emp1 = new employee("sahand",  "kochar", 1788.365);
        employee emp2 = new employee("hama", " ahamd", 7894.321);
        
          System.out.println("NAME                 YEARLY SALARY");
        System.out.printf("%s %s       $%.2f%n", emp1.getfn(), emp1.getln(), emp1.getyearsalary());
        System.out.printf("%s %s     $%.2f%n", emp2.getfn(), emp2.getln(), emp2.getyearsalary());

        System.out.println("\n10 Percent Salary Raised!! Yoohooooo!!\n");

        emp1.raisesalary(10);
        emp2.raisesalary(10);

        System.out.println("NAME                 YEARLY SALARY");
        System.out.printf("%s %s       $%.2f%n", emp1.getfn(), emp1.getln(), emp1.getyearsalary());
        System.out.printf("%s %s     $%.2f%n", emp2.getfn(), emp2.getln(), emp2.getyearsalary());

         
         
         
         
         
    }
    
   
           
    
    
    
    
    
    
    
    
    
}

