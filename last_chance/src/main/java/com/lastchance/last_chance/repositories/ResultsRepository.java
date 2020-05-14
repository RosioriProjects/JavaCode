package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Results;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ResultsRepository extends JpaRepository<Results, Integer> {

    ArrayList<Results> findAll();

}
