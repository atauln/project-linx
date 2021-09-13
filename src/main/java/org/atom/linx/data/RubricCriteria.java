package org.atom.linx.data;

class RubricRating {
    public int points;
    public String id;
    public String description;
    public String long_description;
}

public class RubricCriteria {
    public int points;
    public String id;
    public String learning_outcome_id;
    public String vendor_guid;
    public String description;
    public String long_description;
    public boolean criterion_use_range;
    public RubricRating ratings;
    public boolean ignore_for_scoring;
}
