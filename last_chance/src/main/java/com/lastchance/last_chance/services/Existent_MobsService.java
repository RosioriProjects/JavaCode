package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Existent_Mobs;
import com.lastchance.last_chance.repositories.Existent_MobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Existent_MobsService {

    private Existent_MobsRepository existent_mobsRepository;

    @Autowired
    public Existent_MobsService(Existent_MobsRepository existent_mobsRepository){
        this.existent_mobsRepository = existent_mobsRepository;
    }

    public ArrayList<Existent_Mobs> getAllExistent_Mobs(){
        return existent_mobsRepository.findAll();
    }

    public Existent_Mobs addExistent_Mob(Existent_Mobs existent_mobs){
        return existent_mobsRepository.save(existent_mobs);
    }
}
