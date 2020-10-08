package io;

/**
 * Plain Ordinary Java Object to store user input.
 */
public final class Input {

    // specify the accepted rating range
    private double minRating;
    private double maxRating;

    private double maxBudget;

    private boolean isKidFriendly;

    public Input(double minRating, double maxRating, double maxBudget, boolean isKidFriendly) {
        this.minRating = minRating;
        this.maxRating = maxRating;
        this.maxBudget = maxBudget;
        this.isKidFriendly = isKidFriendly;
    }

    public double getMinRating() {
        return minRating;
    }

    public double getMaxRating() {
        return maxRating;
    }

    public double getMaxBudget() {
        return maxBudget;
    }

    public boolean isKidFriendly() {
        return isKidFriendly;
    }
}
