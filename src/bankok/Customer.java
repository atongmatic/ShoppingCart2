package bankok;

import shoppingcart.Cart;

public class Customer {
    public String name ;
    public int money;
    
    public Customer(String name, int money){
        this.name = name;
        this.money = money;
    }
    
    public void pay(Cart cart){
        double remainMoney = money - cart.checkout();
        System.out.println("Total price checkout is " + cart.checkout());
        System.out.println("I only remaining " + remainMoney);
        // remove money 
    }                  
}