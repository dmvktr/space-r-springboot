package com.codecool.dao;

import com.codecool.model.events.Events;

public interface EventDao {
    Events getById();

    Events getAllEvents();

    void updateEvents(Events events);
}
