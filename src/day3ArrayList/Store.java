package day3ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    private ArrayList<Item> items;
    
    public void store(){
        items = new ArrayList<>();
    }
    
    public void setArray(){
        String[] product = {"iPhone","Samsung","Huawei"};
        ArrayList<String> myArrayList = new ArrayList(Arrays.asList(product));
    }
    }

    public void addItem(Item items){
        items.add("");
    }
    
}
