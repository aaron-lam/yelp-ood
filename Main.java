import customer.Customer;
import io.Input;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Yelp yelp = new Yelp();
        Customer customer = new Customer("a@a.com", new Date());
        Input input = new Input(1, 5, 300, true);
        System.out.println(yelp.search(customer, input));
        System.out.println(yelp.getSuggestedRoute(customer, input));
    }
}
