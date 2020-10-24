package com.tugrankenger.springboot.restapi.DAO;

import com.tugrankenger.springboot.restapi.Entity.LostActors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LostActorsRepository  extends JpaRepository<LostActors,Integer> {

    // no need implementation class
}
