package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Existent_Buildings;
import com.lastchance.last_chance.repositories.Existent_BuildingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Existent_BuildingsService {
    private Existent_BuildingsRepository existent_buildingsRepository;

    @Autowired
    public Existent_BuildingsService(Existent_BuildingsRepository existent_buildingsRepository) {
       this.existent_buildingsRepository = existent_buildingsRepository;
    }

    public ArrayList<Existent_Buildings> getAllExistent_Buildings(){
        return existent_buildingsRepository.findAll();
    }

    public Existent_Buildings addExistent_Building(Existent_Buildings existent_buildings){
        return existent_buildingsRepository.save(existent_buildings);
    }
}
