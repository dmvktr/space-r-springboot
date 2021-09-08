package com.codecool.dao;
import com.codecool.model.spacecrafts.Spacecrafts;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository("spacecraftDao")
public class SpacecraftDaoMem implements SpacecraftDao {
    private Spacecrafts spacecrafts;

    @Override
    public Spacecrafts getBy(int id) {
        return null;
    }

    @Override
    public Spacecrafts getAllSpacecrafts() {
        return spacecrafts;
    }

    @Override
    public void updateSpacecrafts(Spacecrafts spacecrafts) {
        this.spacecrafts = spacecrafts;
    }
}
