package com.codecool.controller;


import com.codecool.dao.ArticleDao;
import com.codecool.dao.AstronautDao;
import com.codecool.dao.SpacecraftDao;
import com.codecool.model.Article;
import com.codecool.model.spacecrafts.Spacecrafts;
import com.codecool.model.astronauts.Astronauts;

import com.codecool.service.APIDataHandler;
import com.codecool.service.DataHandlerService;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@CrossOrigin("http://localhost:3000")
@org.springframework.web.bind.annotation.RestController
public class RestController {
    private APIDataHandler apiDataHandler;
    private DataHandlerService dataService;


    public RestController(APIDataHandler apiDataHandler, DataHandlerService dataService) {
        this.apiDataHandler = apiDataHandler;
        this.dataService = dataService;
    }


    @ResponseBody
    @GetMapping("/news")
    public List<Article> news() {
        ArticleDao articleDao = dataService.getArticleDao();
        List<Article> articles = apiDataHandler.fetchData(APIAccessRoutes.NEWS);
        articleDao.updateNews(articles);
        return articleDao.getAllArticles();
    }


    @ResponseBody
    @GetMapping("/astronauts")
    public Astronauts astronaut() {
        AstronautDao astronautDao = dataService.getAstronautDao();
        Astronauts astronauts = apiDataHandler.fetchAstronautsData(APIAccessRoutes.ASTRONAUTS);
        astronautDao.updateAstronauts(astronauts);
        return astronautDao.getAllAstronauts();
    }


    @ResponseBody
    @GetMapping("/spacecrafts")
    public Spacecrafts spacecrafts() {
        SpacecraftDao spacecraftDao = dataService.getSpacecraftDao();
        Spacecrafts spacecrafts = apiDataHandler.fetchSpacecrafts(APIAccessRoutes.SPACECRAFTS);
        spacecraftDao.updateSpacecrafts(spacecrafts);
        return spacecraftDao.getAllSpacecrafts();
    }

}
