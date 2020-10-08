import activities.Activity;
import activities.SeattleAirportParty;
import io.Input;
import io.Output;
import places.Place;
import places.airports.SeattleAirport;

import java.util.LinkedList;
import java.util.List;

public class Yelp {
    private List<Place> allPlaces;
    private List<Activity> allActivities;
    private RouteRecommender routeRecommender;

    public Yelp() {
        // add all spots and activities here...
        // Normally activities and spots are stored in DB.
        this.allPlaces = new LinkedList<>();
        allPlaces.add(new SeattleAirport());
        this.allActivities = new LinkedList<>();
        allActivities.add(new SeattleAirportParty());
        this.routeRecommender = new RouteRecommender();
    }

    /**
     * @return a filtered list of places.
     */
    public List<Output> search(Customer customer, Input userInput) {
        // skip implementation
        return new LinkedList<>();
    }

    public List<Route> getSuggestedRoute(Customer customer, Input userInput) {
        return routeRecommender.getSuggestedRoutes(customer, userInput);
    }
}
