package shoppingcart;

import bankok.Customer;

public class ShoppingCart {
    /* * @param args the command line arguments */
    public static void main(String[] args) {
        // TODO code application logic here
        Item[] items = new Item[4];
        items[0] = new Item("Shirt",10,10);
        items[1] = new Item("Polo",20,10);
        items[2] = new Item("Plant",30,10);
        items[3] = new Item("Polo2",40,10);
        
        /*
        Item[] items = {new Item("Shirt",10,10);
                        new Item("Polo",20,10);
                        new Item("Plant",30,10);
                        new Item("Polo2",40,10)};
        */        
                
        Customer customer1 = new Customer("duke",100);
        
        Cart cart = new Cart();
        cart.addItem(items[0]);
        cart.addItem(items[1]);
        cart.addItem(items[2]);
        //double totalPrice = cart.checkout();
        
        customer1.pay(cart);
    }
}
