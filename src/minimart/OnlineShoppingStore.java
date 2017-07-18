package minimart;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShoppingStore {

    ArrayList<Item> items;
    ArrayList<Item> shoppingCart;

    public OnlineShoppingStore() {
        items = new ArrayList<>();
        items.add(new ClockItem(1, 10));
        items.add(new ShairItem(2, 40));
        items.add(new CalculatorItem(3, 20));

        shoppingCart = new ArrayList<>();
    }
    
    public void welcome(){
        System.out.println(" *** Welcome to Online Shopping *** ");
        System.out.println(" Item |   Product     |   Price");
         System.out.println(" ----------------------------------");       
    }
    public void askCustomerToBuy() {
        System.out.println(" ----------------------------------"); 
        System.out.println("What would you like to buy ?");
    }
    
    public void atong(){
        System.out.println("What is the JAVA");
    }
    
    public void getInputCustomer() {
    String input;
    do {    
            welcome();
            showItems(items);
            askCustomerToBuy();
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            for (Item item : items) {
                if (Integer.valueOf(input).equals(item.id)) {
                    //shoppingCart.add(item);
                    System.out.println("What amount of " + item.name + " ?");
                    input = sc.nextLine();
                    int amount = Integer.valueOf(input);
                    item.setQty(amount);
                    shoppingCart.add(item);
                    break;
                }
            }
                    System.out.println("Do you want to shopping again  [y/N]?");
                    input = sc.nextLine();            
        } while (input.equalsIgnoreCase("y"));
        checkout();
        /*
        double total = 0;
        if (shoppingCart.size() > 0){
            System.out.println("Thank your for your shopping");
            for ( Item item : shoppingCart) {
                System.out.println(item.id + " : " + item.name + " amount=" + item.qty);
                total = total + (item.qty * item.price);
            }
            System.out.println("Total Amount = " + total);
        }
        */
    }

    public void showItems(ArrayList<Item>  items) {
        for ( Item item : items) {
            System.out.println("   "+ item.id + "  |   " + item.name + "    (" + item.price + ")");
        }
    }
    
        public void checkout(){
        double total = 0;
        int sumqty = 0;
        if (shoppingCart.size() > 0){
            System.out.println("*** Summary of your Item ***");
            for ( Item item : shoppingCart) {
                System.out.println(item.id + " : " + item.name + " amount=" + item.qty);
                sumqty = sumqty + item.qty;
                total = total + (item.qty * item.price);
            }
            System.out.println("====================================");
            System.out.println("### Thank your for your shopping ###");
            System.out.println(">>> Total Items = " + sumqty);
            System.out.println(">>> Total Amount = " + total);
        }
    }

}
