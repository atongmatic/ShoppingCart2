package shoppingcart;

public class Item {
    
        public String name;
        public double price;
        public int qty;

    Item(String name, double price, int qty) {
        this.price = price;
        this.qty = qty;    
        this.name = name;
    }
                
}
