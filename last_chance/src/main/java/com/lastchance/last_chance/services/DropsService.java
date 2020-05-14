package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Drops;
import com.lastchance.last_chance.repositories.DropsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DropsService {
    private DropsRepository dropsRepository;

    @Autowired
    public DropsService(DropsRepository dropsRepository) {
        this.dropsRepository = dropsRepository;
    }

    public ArrayList<Drops> getAllDrops(){
        return dropsRepository.findAll();
    }

    public Drops addDrop(Drops drop){
        return dropsRepository.save(drop);
    }
}
