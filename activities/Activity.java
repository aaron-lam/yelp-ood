package activities;

import java.util.Date;

public abstract class Activity {
    private String activityName;
    private Date startDate;
    private double averageMoneySpent;
    private boolean isKidFriendly;

    public Activity(String activityName, Date startDate, double averageMoneySpent, boolean isKidFriendly) {
        this.activityName = activityName;
        this.startDate = startDate;
        this.averageMoneySpent = averageMoneySpent;
        this.isKidFriendly = isKidFriendly;
    }

    public String getActivityName() {
        return activityName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public double getAverageMoneySpent() {
        return averageMoneySpent;
    }

    public boolean isKidFriendly() {
        return isKidFriendly;
    }
}
