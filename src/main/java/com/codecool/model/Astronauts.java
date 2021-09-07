package com.codecool.model;

import java.util.List;

public class Astronauts {
    private String next;
    private String previous;
    private List<Astronaut> results;

    public List<Astronaut> getResults() {
        return results;
    }

    public void setResults(List<Astronaut> results) {
        this.results = results;
    }

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
}
