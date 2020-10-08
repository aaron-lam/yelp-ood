package io;

import java.util.List;
import activities.Activity;

public final class Output {

    private String placeName;
    private List<Activity> activities;

    public Output(String placeName, List<Activity> activities) {
        this.placeName = placeName;
        this.activities = activities;
    }

    public String getPlaceName() {
        return placeName;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}
