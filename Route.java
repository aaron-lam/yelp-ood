import activities.Activity;

import java.util.List;

public class Route {

    private double totalDistance;
    private double estimatedTimeSpend;
    private double totalCost;
    private List<Activity> activities;

    public Route(List<Activity> activities) {
        this.activities = activities;
    }

    public void add(Activity activity) {
        this.activities.add(activity);
    }

    public void remove(Activity activity) {
        this.activities.remove(activity);
    }

    public void clear() {
        this.activities.clear();
    }
}
