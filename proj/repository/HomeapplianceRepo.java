package com.example.proj.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proj.model.Homeappliance;

public interface HomeapplianceRepo extends JpaRepository<Homeappliance,Integer>{

}