package day2;

import java.util.Scanner;

/**
 *
 * @author ARIT
 */
public class MyString {
    public static void main(String[] args) {
              
        System.out.print("Please enter your Firstname and Lastname : ");
        Scanner sc = new Scanner(System.in);        
        String input = sc.nextLine();
        int spaceIndex = input.indexOf(" ");
        String firstNname = input.substring(0,spaceIndex);
        String lastName = input.substring(spaceIndex);
        
        System.out.println("Fisrt Name = " + firstNname);
        System.out.println("Last Name = " + lastName);
        
        
    }
    
    
}
