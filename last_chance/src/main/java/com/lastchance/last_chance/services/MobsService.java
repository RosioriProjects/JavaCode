package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Mobs;
import com.lastchance.last_chance.repositories.MobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MobsService {

    private MobsRepository mobRepository;

    @Autowired

    public MobsService(MobsRepository mobRepository) {
        this.mobRepository = mobRepository;
    }

    public ArrayList<Mobs> getAllMobs(){
        return mobRepository.findAll();
    }

    public Mobs addMob(Mobs mob){
        return mobRepository.save(mob);
    }
}
