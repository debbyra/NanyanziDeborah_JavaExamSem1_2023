//Question2 ii. REG No. 031

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
//    restaurant attributes
    List<String> menuItems;
    int prices;
    int ratings;


// getters and setters for our attributes
    public List<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

//    methods to add and remove
    public void addMenuItems(String newItem) {
        if (menuItems == null) {
            menuItems = new ArrayList<>();
        }
        menuItems.add(newItem);
    }



    public static void main(String[] args) {
//      instance restaurant object
        Restaurant obj = new Restaurant();
//        add items
        obj.addMenuItems("samosa");
        obj.addMenuItems("pizza");
        obj.addMenuItems("coffee");

//        remove the items



        System.out.println("Menu Items: "+obj.getMenuItems());

    }
}
