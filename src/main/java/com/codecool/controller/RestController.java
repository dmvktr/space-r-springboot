package com.codecool.controller;


import com.codecool.dao.ArticleDao;
import com.codecool.model.Article;
import com.codecool.service.APIDataHandler;
import com.codecool.service.DataHandlerService;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

}
