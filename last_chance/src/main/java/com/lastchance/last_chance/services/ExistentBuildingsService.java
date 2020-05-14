package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.ExistentBuildings;
import com.lastchance.last_chance.repositories.ExistentBuildingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ExistentBuildingsService {
    private ExistentBuildingsRepository existent_buildingsRepository;

    @Autowired
    public ExistentBuildingsService(ExistentBuildingsRepository existent_buildingsRepository) {
       this.existent_buildingsRepository = existent_buildingsRepository;
    }

    public ArrayList<ExistentBuildings> getAllExistent_Buildings(){
        return existent_buildingsRepository.findAll();
    }

    public ExistentBuildings addExistent_Building(ExistentBuildings existent_buildings){
        return existent_buildingsRepository.save(existent_buildings);
    }
}
