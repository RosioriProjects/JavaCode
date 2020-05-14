package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Crates;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface CratesRepository extends JpaRepository<Crates , Integer> {

    ArrayList<Crates> findAll();
}
