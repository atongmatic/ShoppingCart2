package day2exerciseteacher;

import java.util.ArrayList;

public class Store {

    private final ArrayList<Item> itemList;// = new ArrayList();

    public Store() {
        itemList = new ArrayList<>();
    }

    public void additem(Item item) {
        switch (item.getName()) {
            case "Shirt":
            case "Polo":
            case "Plant":
            case "Sport":
                itemList.add(item);
                break;
        }

    }

    public void showItem(Item item) {
        for (int ii = 0; ii < itemList.size(); ii++) {
            System.out.println(ii + ". " + itemList.get(ii));
        }
    }

}
  
    //public void printitem(Item item){
    
    //}

/*
        ItemList.add(new Item("Shirt",5));
        ItemList.add(new Item("Polo",8));
        ItemList.add(new Item("Plant",10));
        ItemList.add(new Item("Sport",12));
 */
