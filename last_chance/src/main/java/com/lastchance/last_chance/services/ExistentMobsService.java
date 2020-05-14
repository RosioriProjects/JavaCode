package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.ExistentMobs;
import com.lastchance.last_chance.repositories.ExistentMobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ExistentMobsService {

    private ExistentMobsRepository existent_mobsRepository;

    @Autowired
    public ExistentMobsService(ExistentMobsRepository existent_mobsRepository){
        this.existent_mobsRepository = existent_mobsRepository;
    }

    public ArrayList<ExistentMobs> getAllExistent_Mobs(){
        return existent_mobsRepository.findAll();
    }

    public ExistentMobs addExistent_Mob(ExistentMobs existent_mobs){
        return existent_mobsRepository.save(existent_mobs);
    }
}
