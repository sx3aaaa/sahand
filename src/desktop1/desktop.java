
package desktop1;

public class desktop {

private String Brand;
private String Processor;
private double Ram;
private double UpgradedRam;



public void setRam(double ram){
    Ram = ram;
}

public double getRam(){
    return Ram;
}


public void setBrand(String brand){
    Brand = brand;
}

public String getBrand(){
    return Brand;
}


public void setProcessor(String processor){
  Processor = processor;
}

public String getprocessor(){
    return Processor;
    
  }  
    public void setUpgradedRam(double extraRam){
        UpgradedRam =  Ram + extraRam;
        
        Ram = UpgradedRam;
    }
    
    public double getUpgradedRam() {
    return UpgradedRam;

    }
}
    














    

