package com.codecool.controller;


import com.codecool.dao.ArticleDao;
import com.codecool.dao.AstronautDao;
import com.codecool.dao.EventDao;
import com.codecool.model.Article;
import com.codecool.model.astronauts.Astronauts;
import com.codecool.model.events.Events;

import com.codecool.service.APIDataHandler;
import com.codecool.service.DataHandlerService;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private APIDataHandler apiDataHandler;
    private DataHandlerService dataService;
    private final String REQUEST_DOMAIN = "http://localhost:3000";

    public RestController(APIDataHandler apiDataHandler, DataHandlerService dataService) {
        this.apiDataHandler = apiDataHandler;
        this.dataService = dataService;
    }

    @CrossOrigin(REQUEST_DOMAIN)
    @ResponseBody
    @GetMapping("/news")
    public List<Article> news() {
        ArticleDao articleDao = dataService.getArticleDao();
        List<Article> articles = apiDataHandler.fetchData(APIAccessRoutes.NEWS);
        articleDao.updateNews(articles);
        return articleDao.getAllArticles();
    }

    @CrossOrigin(REQUEST_DOMAIN)
    @ResponseBody
    @GetMapping("/astronauts")
    public Astronauts astronaut() {
        AstronautDao astronautDao = dataService.getAstronautDao();
        Astronauts astronauts = apiDataHandler.fetchAstronautsData(APIAccessRoutes.ASTRONAUTS);
        astronautDao.updateAstronauts(astronauts);
        return astronautDao.getAllAstronauts();
    }

    @CrossOrigin(REQUEST_DOMAIN)
    @ResponseBody
    @GetMapping("/events")
    public Events events() {
        EventDao eventDao = dataService.getEventDao();
        Events events = apiDataHandler.fetchEventsData(APIAccessRoutes.EVENTS);
        eventDao.updateEvents(events);
        return eventDao.getAllEvents();
    }

}
