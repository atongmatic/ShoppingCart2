package day3inherit;

public class Plant extends Cloth{
    private final char gender;
  
    public Plant(double price, char size,String type,char gender) {
        super(price, size,type);
        this.gender = 'M';
    }

    @Override
    public double getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
