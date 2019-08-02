package com.example.demo.services;

import com.example.demo.entities.SignWorkDayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkDayRepository extends JpaRepository<SignWorkDayEntity, Long>{

}
