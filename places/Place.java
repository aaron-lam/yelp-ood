package places;

import activities.Activity;
import io.Input;
import io.Output;

import java.util.LinkedList;
import java.util.List;

public abstract class Place {
    private double rating;
    private List<Activity> activities = new LinkedList<>();

    public abstract Output getSearchResults(Input input);

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public void removeActivity(Activity activity) {
        this.activities.remove(activity);
    }
}
