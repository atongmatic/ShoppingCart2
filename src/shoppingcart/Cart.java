package shoppingcart;

public class Cart {

    Item[] items;
    Double total;

    public Cart() {
        // New Enter here
        items = new Item[5];
    }

    public void addItem(Item item) {
        // Insert item in to items array        
        for (int i=0; i<items.length; i++){
            if (items[i] == null){
                items[i] = item;
                break;
            }
        }
    }

    public void removeItem(Item item) {
        // Remove item from items array   
    }

    public double checkout() {
        double totalPrice = 0.0;
        // Sum(Multiply Items*Price)
        for(Item item : items){
            if (item!= null) {
                totalPrice = totalPrice + (item.price);                    
            }
        }
        return totalPrice;
    }
}
