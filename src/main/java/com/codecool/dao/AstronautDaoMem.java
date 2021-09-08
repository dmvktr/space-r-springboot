package com.codecool.dao;
import com.codecool.model.astronauts.Astronauts;
import org.springframework.stereotype.Repository;

@Repository("astronautDao")
public class AstronautDaoMem implements AstronautDao {

    private Astronauts astronauts;
    @Override
    public Astronauts getBy(int id) {
        return null;
    }

    @Override
    public Astronauts getAllAstronauts() {
        return astronauts;
    }

    @Override
    public void updateAstronauts(Astronauts astronauts) {
        this.astronauts = astronauts;
    }
}
