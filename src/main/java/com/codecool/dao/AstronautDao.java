package com.codecool.dao;

import com.codecool.model.astronauts.Astronauts;

public interface AstronautDao {
    Astronauts getBy(int id);

    Astronauts getAllAstronauts();

    void updateAstronauts(Astronauts astronauts);

}
