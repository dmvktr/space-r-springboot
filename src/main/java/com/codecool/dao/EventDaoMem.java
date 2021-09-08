package com.codecool.dao;

import com.codecool.model.events.Events;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventDaoMem implements EventDao {

    private Events events;

    @Override
    public Events getById() {
        return null;
    }

    @Override
    public Events getAllEvents() {
        return events;
    }

    @Override
    public void updateEvents(Events events) {
        this.events = events;
    }

}
