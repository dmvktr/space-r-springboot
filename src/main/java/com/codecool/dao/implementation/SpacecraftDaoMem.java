package com.codecool.dao.implementation;
import com.codecool.dao.SpacecraftDao;
import com.codecool.model.spacecrafts.Spacecrafts;
import com.codecool.service.APIDataHandler;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("spacecraftDao")
public class SpacecraftDaoMem implements SpacecraftDao {
    private final APIDataHandler apiDataHandler;

    @Autowired
    public SpacecraftDaoMem(APIDataHandler apiDataHandler) {
        this.apiDataHandler = apiDataHandler;
    }

    @Override
    public Spacecrafts getBy(int id) {
        return null;
    }

    @Override
    public Spacecrafts getAllSpacecrafts() {
        return apiDataHandler.fetchData(APIAccessRoutes.SPACECRAFTS, Spacecrafts.class);
    }

    @Override
    public void updateSpacecrafts(Spacecrafts spacecrafts) { }
}
