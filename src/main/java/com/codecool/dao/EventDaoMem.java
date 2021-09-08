package com.codecool.dao;

import com.codecool.model.events.Events;
import com.codecool.service.APIDataHandler;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


@Repository("eventDao")
public class EventDaoMem implements EventDao {
    private final APIDataHandler apiDataHandler;

    @Autowired
    public EventDaoMem(APIDataHandler apiDataHandler) {
        this.apiDataHandler = apiDataHandler;
    }

    @Override
    public Events getById() {
        return null;
    }

    @Override
    public Events getAllEvents() {
        return apiDataHandler.fetchData(APIAccessRoutes.EVENTS, Events.class);
    }

    @Override
    public void updateEvents(Events events) { }

}
