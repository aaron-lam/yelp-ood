import customer.Customer;
import io.Input;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        YelpSystem yelpSystem = new YelpSystem();
        Customer customer = new Customer("a@a.com", new Date());
        Input input = new Input(1, 5, 300, true);
        System.out.println(yelpSystem.search(customer, input));
        System.out.println(yelpSystem.getSuggestedRoute(customer, input));
    }
}
