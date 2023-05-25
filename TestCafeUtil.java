import java.util.ArrayList;

public class TestCafeUtil {
    public static void main(String[] args) {
        CafeUtil getAllMethods= new CafeUtil();
        ArrayList<Double> priceItems = new ArrayList<Double>();
        ArrayList<String> menuItems = new ArrayList<String>();
        ArrayList<String> customerList= new ArrayList<String>();
        // this is added 
        priceItems.add(0,2.3);
        priceItems.add(1, 1.7);
        priceItems.add(2, 1.5);
        priceItems.add(3, 1.2);
        priceItems.add(4, 2.2);

        menuItems.add(0,"coffee");
        menuItems.add(1, "Lemon cake");
        menuItems.add(2, "Late");
        menuItems.add(3, "Capucino");
        menuItems.add(4, "Tea");

        Integer getSumStreak = getAllMethods.getStreakGoal();
        System.out.println("Purchases needed by week 10:" + getSumStreak);
            
        Double getSumPrices = getAllMethods.getOrderTotal( priceItems);
        System.out.println("Order toral :"+ getSumPrices);

        getAllMethods.displayMenu(menuItems);
        getAllMethods.addCustomer(customerList);
        }
    }