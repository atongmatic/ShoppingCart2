package day2exercise92;
public class ShoppingCart {
    public static void main(String args[]){
        // Declare, instantiate, and initialize a Customer object
        Customer cust1 = new Customer("Bob Miller", "555-44-3212");
        cust1.setName("ATONG");
	// Print the customer object name
        System.out.println("Customer name: "+cust1.getName());
       
        int x = 99;
            switch (x){
            case 3: case 7: case 8: 
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");                
                break;
            default :
                System.out.println("Default = " + x);                                
            }
         
        
          
    }
}
