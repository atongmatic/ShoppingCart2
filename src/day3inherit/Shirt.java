package day3inherit;
public class Shirt extends Cloth{
    final char shape;

       
    //@Override
    public double getPrice(){
        return price *10 ;
    }

    public Shirt(double price, char size,char shape){
        this(price,size,"Shirt",shape);
        
    }
//    private Shirt(double price, char size, String type, char Shape) {
//        super(price, size, type);
//        this.Shape = Shape;
//    }

    @Override
    public double getCost() {
        return 10;
    }
    @Override
    public String toString(){
        return "I am a Nice Shirt";
    }
}
