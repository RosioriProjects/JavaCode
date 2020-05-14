package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Crates;
import com.lastchance.last_chance.repositories.CratesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CratesService {
    private CratesRepository cratesRepository;

    @Autowired
    public CratesService(CratesRepository cratesRepository) {
        this.cratesRepository = cratesRepository;
    }

    public ArrayList<Crates> getAllCrates(){
        return cratesRepository.findAll();
    }

    public Crates addCrate(Crates crate){
        return cratesRepository.save(crate);
    }
}
