package places.airports;

import activities.SeattleAirportParty;
import io.Input;
import io.Output;

import java.util.LinkedList;

public class SeattleAirport extends Airport {

    public SeattleAirport() {
        this.addActivity(new SeattleAirportParty());
    }

    @Override
    public Output getSearchResults(Input input) {
        // skip implementation of how to filter results
        return new Output("Seattle Airport 1", new LinkedList<>());
    }
}
