package spring.setterInjection.setterInjectionMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ShoppingList {
    private int id;
    private String shopName;
    private Map<String, String> shoppingDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Map<String, String> getShoppingDetails() {
        return shoppingDetails;
    }

    public void setShoppingDetails(Map<String, String> shoppingDetails) {
        this.shoppingDetails = shoppingDetails;
    }

    public void displayInfo() {
        System.out.println("ShopId: " + id);
        System.out.println("ShopName: " + shopName);
        System.out.println("Answers.....");
        Set<Map.Entry<String, String>> set = shoppingDetails.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Answer " + entry.getKey() + " Posted By " + entry.getValue());
        }
    }
}
