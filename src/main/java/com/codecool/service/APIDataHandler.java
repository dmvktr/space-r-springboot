package com.codecool.service;

import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.stereotype.Component;

@Component
public class APIDataHandler {

    public String fetchAPIRoute(APIAccessRoutes api){
        return api.getApiPath();
    }
}
