package day2exerciseteacher;

public class Item {

    private final String name;
    private final double price;
    private int qty;
    
    public Item(String name,double price){
        this.name = name;
        this.price = price;
    }
    
    public void setQty(int qty){
      this.qty = qty;     
    }
    public int getQty()
    {
        return qty;
    }
            
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    
/*    
    public void getname(){
        name = "ATONG";    }
    
    public void getprice (){
        price = 12345;
    }
    
    public String setqty(int qty ){
        return (qty);}
*/
    
}
