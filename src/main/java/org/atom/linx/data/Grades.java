package org.atom.linx.data;

public class Grades {
    protected String html_url;
    protected int current_score;
    protected Object current_grade;
    protected double final_score;
    protected Object final_grade;

    public String getHtmlUrl() {
        return html_url;
    }

    public void setHtmlUrl(String html_url) {
        this.html_url = html_url;
    }

    public int getCurrentScore() {
        return current_score;
    }

    public void setCurrentScore(int current_score) {
        this.current_score = current_score;
    }

    public Object getCurrentGrade() {
        return current_grade;
    }

    public void setCurrentGrade(Object current_grade) {
        this.current_grade = current_grade;
    }

    public double getFinalScore() {
        return final_score;
    }

    public void setFinalScore(double final_score) {
        this.final_score = final_score;
    }

    public Object getFinalGrade() {
        return final_grade;
    }

    public void setFinalGrade(Object final_grade) {
        this.final_grade = final_grade;
    }
}
