package com.codecool.dao;

import com.codecool.model.spacecrafts.Spacecrafts;

public interface SpacecraftDao {

        Spacecrafts getBy(int id);

        Spacecrafts getAllSpacecrafts();

        void updateSpacecrafts(Spacecrafts spacecraft);

}
