package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Results;
import com.lastchance.last_chance.repositories.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ResultsService {

    private ResultsRepository resultsRepository;

    @Autowired

    public ResultsService(ResultsRepository resultsRepository) {
        this.resultsRepository = resultsRepository;
    }

    public ArrayList<Results> getAllResults(){
        return resultsRepository.findAll();
    }

    public Results addResult(Results result){
        return resultsRepository.save(result);
    }
}

