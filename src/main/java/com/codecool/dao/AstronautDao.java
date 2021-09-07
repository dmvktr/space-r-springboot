package com.codecool.dao;

import com.codecool.model.Astronauts;

public interface AstronautDao {
    Astronauts getBy(int id);

    Astronauts getAllAstronauts();

    void updateAstronauts(Astronauts astronauts);

}
