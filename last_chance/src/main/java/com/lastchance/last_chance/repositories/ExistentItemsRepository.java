package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.ExistentItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExistentItemsRepository extends JpaRepository<ExistentItems,Integer> {

   // ArrayList<ExistentItems> findAll();

}
