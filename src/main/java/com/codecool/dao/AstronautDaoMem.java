package com.codecool.dao;
import com.codecool.model.astronauts.Astronauts;
import com.codecool.service.APIDataHandler;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("astronautDao")
public class AstronautDaoMem implements AstronautDao {

    private final APIDataHandler apiDataHandler;

    @Autowired
    public AstronautDaoMem(APIDataHandler apiDataHandler) {
        this.apiDataHandler = apiDataHandler;
    }

    @Override
    public Astronauts getBy(int id) {
        return null;
    }

    @Override
    public Astronauts getAllAstronauts() {
        return apiDataHandler.fetchData(APIAccessRoutes.ASTRONAUTS, Astronauts.class);
    }

    @Override
    public void updateAstronauts(Astronauts astronauts) { }
}
