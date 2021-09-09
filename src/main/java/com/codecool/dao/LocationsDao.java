package com.codecool.dao;

import com.codecool.model.locations.Location;
import com.codecool.model.locations.Locations;

public interface LocationsDao {
    Location getBy(int id);

    Locations getAllLocations();

    void updateLocations(Locations locations);
}
