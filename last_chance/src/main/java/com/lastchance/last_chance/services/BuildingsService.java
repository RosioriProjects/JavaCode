package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Buildings;
import com.lastchance.last_chance.repositories.BuildingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BuildingsService {

    private BuildingsRepository buildingsRepository;

    @Autowired
    public BuildingsService(BuildingsRepository buildingsRepository) {
        this.buildingsRepository = buildingsRepository;
    }

    public ArrayList<Buildings> getAllBuildings(){
        return buildingsRepository.findAll();
    }

    public Buildings addBuilding(Buildings build){
        return buildingsRepository.save(build);
    }
}
