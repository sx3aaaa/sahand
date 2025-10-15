package person;

public class personinfo {
    
    private String name;
private String country;
private int age;

public void setname(String Name){
    name = Name;
}

public String getname(){
    return name;
}


public void setcountry(String Country){
    country = Country;
}

public String getcountry(){
    return country;
}


public void setage(int Age){
     age = Age;
}

public int getage(){
    return age;
}

    public  void display() {
        System.out.println("welcome to oop activity "+" " +getname() +"from: " + " "+getcountry() +" " + "Age: " +getage() );
    }
    
    
    
    
    
}
