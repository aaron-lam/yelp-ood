package customer;

import activities.Activity;
import routes.Route;

import java.util.Date;
import java.util.List;

public class Customer {

    private String email;
    private Date dateOfBirth;
    List<Route> routes;

    public Customer(String email, Date dateOfBirth) {
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void add(Route route) {
        routes.add(route);
    }

    public void remove(Route route) {
        routes.remove(route);
    }

    public void clear(Route route) {
        routes.clear();
    }

    public void addActivity(int index, Activity activity) {
        routes.get(index).add(activity);
    }

    public void removeActivity(int index, Activity activity) {
        routes.get(index).remove(activity);
    }

    public void clearActivity(int index) {
        routes.get(index).clear();
    }
}
