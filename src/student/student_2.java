
package student;

public class student_2 {
    private String name;
    private int ID ;
    public static int dwayID=1;
    private int semester;
    private final String department = " cs";
    
    public student_2(String name,int semester){
        this.ID = dwayID++;
        this.name = name;
        this.semester = semester;
        
    }

    public void setdwayID(int id){
        dwayID=id;
        
    }
    
    public int dwayId(){
        return dwayID;
    }
    
    
   public String getdepartment(){
       return department;
       
   }
   public String getname(){
       return name;
   }
    
    public int semester(){
        return semester ;
    }
    
    public int getID(){
        return ID;
    }
    
    
    public void display(){
        System.out.println("student ID: "+ID);
        System.out.println("Student name: "+name);
        System.out.println("department: "+department);
        System.out.println("semster: "+semester);
        

        
    }
 
    
}
