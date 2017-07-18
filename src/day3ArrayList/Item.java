package day3ArrayList;

public class Item {
    private String name;
    private double price;     
    
    public Item(String name,double price){
        this.name = name;
        this.price = price;
   }
    
    public void setName(String name){
      this.name = name;     
    }
    public String getName(){
        return name;
    }
}
