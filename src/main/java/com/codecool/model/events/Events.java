package com.codecool.model.events;

import java.util.List;

public class Events {
    private String next;
    private String previous;
    private List<Event> events;

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

    public List<Event> getResults() {
        return events;
    }

    public void setResults(List<Event> events) {
        this.events = events;
    }
}
