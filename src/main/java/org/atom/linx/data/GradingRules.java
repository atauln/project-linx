package org.atom.linx.data;

public class GradingRules {
    protected int drop_lowest;
    protected int drop_highest;
    protected int[] never_drop;

    public int getDropLowest() {
        return drop_lowest;
    }

    public void setDropLowest(int drop_lowest) {
        this.drop_lowest = drop_lowest;
    }

    public int getDropHighest() {
        return drop_highest;
    }

    public void setDropHighest(int drop_highest) {
        this.drop_highest = drop_highest;
    }

    public int[] getNeverDrop() {
        return never_drop;
    }

    public void setNeverDrop(int[] never_drop) {
        this.never_drop = never_drop;
    }
}
