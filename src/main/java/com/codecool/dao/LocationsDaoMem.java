package com.codecool.dao;
import com.codecool.model.locations.Locations;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationsDaoMem implements LocationsDao{
    private Locations locations;
    @Override
    public Locations getBy(int id) {
        return null;
    }

    @Override
    public Locations getAllLocations() {
        return locations;
    }

    @Override
    public void updateLocations(Locations locations) {
        this.locations = locations;

    }
}
