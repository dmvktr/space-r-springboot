package com.codecool.dao;
import com.codecool.model.locations.Locations;
import com.codecool.service.APIDataHandler;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("locationsDao")
public class LocationsDaoMem implements LocationsDao{
    private final APIDataHandler apiDataHandler;

    @Autowired
    public LocationsDaoMem(APIDataHandler apiDataHandler) {
        this.apiDataHandler = apiDataHandler;
    }

    @Override
    public Locations getBy(int id) {
        return null;
    }

    @Override
    public Locations getAllLocations() {
        return apiDataHandler.fetchData(APIAccessRoutes.LOCATIONS, Locations.class);
    }

    @Override
    public void updateLocations(Locations locations) { }
}
