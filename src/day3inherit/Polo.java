package day3inherit;

public class Polo extends Cloth{
    
    char color;
    
    //public Cloth(double price,char size,String type){
  
    public Polo(double price, char size,char shape){
        this(price, size,"Polo",shape);

    }

    @Override
    public double getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
