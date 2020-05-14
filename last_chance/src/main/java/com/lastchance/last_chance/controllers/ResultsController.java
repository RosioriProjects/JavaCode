package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Results;
import com.lastchance.last_chance.services.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/results")
public class ResultsController {
    private ResultsService resultsService;

    @Autowired
    public ResultsController(ResultsService resultsService) {
        this.resultsService = resultsService;
    }

    @GetMapping("get")
    public List<Results> getAllResults(){
        return resultsService.getAllResults();
    }

    @PostMapping("add")
    public Results addResult(@RequestBody Results result){
        return resultsService.addResult(result);
    }
}
