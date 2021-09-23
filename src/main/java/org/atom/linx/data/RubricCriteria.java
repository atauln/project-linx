package org.atom.linx.data;

class RubricRating {
    protected int points;
    protected String id;
    protected String description;
    protected String long_description;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return long_description;
    }

    public void setLongDescription(String long_description) {
        this.long_description = long_description;
    }
}

public class RubricCriteria {
    protected int points;
    protected String id;
    protected String learning_outcome_id;
    protected String vendor_guid;
    protected String description;
    protected String long_description;
    protected boolean criterion_use_range;
    protected RubricRating ratings;
    protected boolean ignore_for_scoring;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLearningOutcomeId() {
        return learning_outcome_id;
    }

    public void setLearningOutcomeId(String learning_outcome_id) {
        this.learning_outcome_id = learning_outcome_id;
    }

    public String getVendorGuid() {
        return vendor_guid;
    }

    public void setVendorGuid(String vendor_guid) {
        this.vendor_guid = vendor_guid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return long_description;
    }

    public void setLongDescription(String long_description) {
        this.long_description = long_description;
    }

    public boolean isCriterionUseRange() {
        return criterion_use_range;
    }

    public void setCriterionUseRange(boolean criterion_use_range) {
        this.criterion_use_range = criterion_use_range;
    }

    public RubricRating getRatings() {
        return ratings;
    }

    public void setRatings(RubricRating ratings) {
        this.ratings = ratings;
    }

    public boolean isIgnoreForScoring() {
        return ignore_for_scoring;
    }

    public void setIgnoreForScoring(boolean ignore_for_scoring) {
        this.ignore_for_scoring = ignore_for_scoring;
    }
}
