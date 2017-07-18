package day3inherit;

public abstract class Cloth {

    final double price;
    private final char size;
    private final String type;

    //protected String factoryName;
    //String type;

    public double sellPrice() {
        return getPrice() * getCost();
    }

    public double getPrice(){
        return price;
    }
    public String getType() {
        return type;
    }

    public abstract double getCost();

    public Cloth(double price, char size, String type) {
        this.price = price;
        this.size = size;
        this.type = type;
    }

    public static void main(String args[]) {
//            Cloth shirt = new Cloth(10,'M');
        Cloth c2 = new Plant(10,'S','O');
        c2.displaySellPrice();
        
        //Cloth c1 = new Shirt(10, 'S', 'O');
        //c1.displaySellPrice();
//        Shirt s1 = new Shirt(20, 'L', 'O');
//        s1.displaySellPrice();

        //Shirt shirt = new Shirt(10,'M','O');
        // System.out.println("This Shirt Price is : "+shirt.getPrice());
    }
    public void displaySellPrice() {
        System.out.println("This cloth is a " +
                getType()+" sell price = " +
                sellPrice());
    }
}
