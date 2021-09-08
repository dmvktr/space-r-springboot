package com.codecool.dao;

import com.codecool.model.locations.Locations;

public interface LocationsDao {
    Locations getBy(int id);

    Locations getAllLocations();

    void updateLocations(Locations locations);
}
