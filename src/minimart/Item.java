package minimart;

public class Item {

    public final int id;
    public final String name;
    public final double price;
    public int qty;

    public Item(int id, String name, double price) {
        this.id = id;
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
}
