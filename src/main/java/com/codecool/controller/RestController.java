package com.codecool.controller;


import com.codecool.dao.ArticleDao;
import com.codecool.dao.AstronautDao;
import com.codecool.model.Article;
import com.codecool.model.astronauts.Astronauts;
import com.codecool.service.APIDataHandler;
import com.codecool.service.DataHandlerService;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private APIDataHandler apiDataHandler;
    private DataHandlerService dataService;
    private String CORS_POLICY = "http://localhost:3000";

    public RestController(APIDataHandler apiDataHandler, DataHandlerService dataService) {
        this.apiDataHandler = apiDataHandler;
        this.dataService = dataService;
    }

    @ResponseBody
    @GetMapping("/news")
    public List<Article> news(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", CORS_POLICY);
        ArticleDao articleDao = dataService.getArticleDao();
        List<Article> articles = apiDataHandler.fetchData(APIAccessRoutes.NEWS);
        articleDao.updateNews(articles);
        return articleDao.getAllArticles();
    }

    @ResponseBody
    @GetMapping("/astronauts")
    public Astronauts astronaut(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", CORS_POLICY);
        AstronautDao astronautDao = dataService.getAstronautDao();
        Astronauts astronauts = apiDataHandler.fetchAstronautsData(APIAccessRoutes.ASTRONAUTS);
        astronautDao.updateAstronauts(astronauts);
        return astronautDao.getAllAstronauts();
    }

}
