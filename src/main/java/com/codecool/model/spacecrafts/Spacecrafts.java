package com.codecool.model.spacecrafts;


import java.util.List;

public class Spacecrafts {
    private String next;
    private String previous;
    private List<Spacecraft> results;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Spacecraft> getResults() {
        return results;
    }

    public void setResults(List<Spacecraft> results) {
        this.results = results;
    }
}
