package com.codecool.controller;

import com.codecool.model.astronauts.Astronaut;
import com.codecool.model.astronauts.Astronauts;
import com.codecool.model.news.News;
import com.codecool.service.DataHandlerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(RestController.class)
class RestControllerIntegrationTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    DataHandlerService dataHandlerService;

    @Test
    void newsRoute_shouldReturnNewsObjectArray_whenUserVisitsRoute() throws Exception {
        News firstNewsArticle = new News("articleTitle", "dummyUrl", "newsSite", "articleUrl", "url", "summaryOfArticle", "publishedAt");
        News secondNewsArticle = new News("articleTitle2", "dummyUrl2", "newsSite2", "articleUrl", "url", "summaryOfArticle", "publishedAt");
        News[] expectedNews = {firstNewsArticle, secondNewsArticle};

        Mockito.when(dataHandlerService.getAllArticles()).thenReturn(expectedNews);
        mockMvc.perform(MockMvcRequestBuilders
            .get("/news"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(jsonPath("$").isArray())
            .andExpect(jsonPath("$", hasSize(2)))
            .andExpect(jsonPath("$[1].title", is("articleTitle2")));
    }

    @Test
    void astronautsRoute_shouldReturnAstronautsObject_whenUserVisitsRoute() throws Exception {
        List<Astronaut> listOfAstronauts = new ArrayList<>(Arrays.asList(new Astronaut(), new Astronaut()));
        Astronauts astronauts = new Astronauts("urlToNextPage", "urlToPreviousPage", listOfAstronauts);

        Mockito.when(dataHandlerService.getAllAstronauts()).thenReturn(astronauts);
        mockMvc.perform(MockMvcRequestBuilders
            .get("/astronauts"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.next").value(
                "urlToNextPage"))
            .andExpect(jsonPath("$.previous").value("urlToPreviousPage"));
    }

    @Test
    void gallery() {
    }

    @Test
    void spacecrafts() {
    }

    @Test
    void locations() {
    }

    @Test
    void events() {
    }
}
