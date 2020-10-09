package activities;

import java.util.Date;

public abstract class Activity {
    private String name;
    private Date startDate;
    private double averageMoneySpent;
    private boolean isKidFriendly;

    public Activity(String name, Date startDate, double averageMoneySpent, boolean isKidFriendly) {
        this.name = name;
        this.startDate = startDate;
        this.averageMoneySpent = averageMoneySpent;
        this.isKidFriendly = isKidFriendly;
    }

    public String getName() {
        return name;
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
