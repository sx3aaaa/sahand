package activity;

public class cube extends square {

    private int volume;
    private int par;
    
        public void setCubeVol() {
        this.volume = length * length * length ;
    }
    
    public int getCubeVolume() {
        return volume;
    }
    
    public void setAreaCube() { 
        this.Area = 6 * (super.length* super.length);
       
    }
    
    public int getAreaCube() {
        return Area;
    }
    
    public void setPara() {
        this.par = 12 * length;
    }
  
    public int getPara() {
        return par;
    }
    
    public void displaycube() {
        System.out.println("name of the cube: "+getName());
        System.out.println("color of the cube: "+getColor());
        System.out.println("area of the cube: " + getAreaCube());
        System.out.println("perimeter of the cube: " + getPara());
        System.out.println("Volume of the cube: " + getCubeVolume());
    }

}
