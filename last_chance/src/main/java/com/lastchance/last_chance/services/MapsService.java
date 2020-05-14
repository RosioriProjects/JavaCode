package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Maps;
import com.lastchance.last_chance.repositories.MapsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MapsService {

    private MapsRepository mapsRepository;

    @Autowired

    public MapsService(MapsRepository mapsRepository) {
        this.mapsRepository = mapsRepository;
    }

    public ArrayList<Maps> getAllMaps(){
        return mapsRepository.findAll();
    }

    public Maps addMap(Maps map){
        return mapsRepository.save(map);
    }
}
