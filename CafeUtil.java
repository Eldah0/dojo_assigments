import java.util.ArrayList;

public class CafeUtil {
    public  int getStreakGoal() {
        int sum=0;
        int numWeeks=10;
        for (int i=1; i<=numWeeks; i++){
            sum=sum+i;
        }
        return sum;
    }
    public Double getOrderTotal( ArrayList<Double> prices){
        Double sum=0.0;
        for (double price :prices){
         sum+=price ;
        }
        return sum ;
    }
    void displayMenu(ArrayList<String> menuItems) {
       for(int i=0 ; i<=menuItems.size(); i++){
        System.out.println(i + " " + menuItems.get(i));
       }
    }
    void addCustomer(ArrayList<String> customers) {
         System.out.println("Enter your name here  : ");
         String userName =  System.console().readLine();

         System.out.println("Hello," + userName + "!");
         int numPeople= customers.size();
         System.out.println("There are " + numPeople + "people in front");
         
         customers.add(userName);
         System.out.println(customers);
    }
}