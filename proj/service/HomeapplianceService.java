package com.example.proj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proj.model.Homeappliance;
import com.example.proj.repository.HomeapplianceRepo;


@Service
public class HomeapplianceService{
    @Autowired
    private HomeapplianceRepo pr;
    public Homeappliance createPatient(Homeappliance p){
        return pr.save(p);
    }

    public List<Homeappliance> getAllPatients(){
        return pr.findAll();
    }
    public Optional<Homeappliance> getPatientById(Integer CustomerId){
        return pr.findById(CustomerId);
    }
    public boolean updateDetails(int CustomerId,Homeappliance l)
    {
        if(this.getPatientById(CustomerId)==null)
        {
            return false;
        }
        try{
            pr.save(l);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
public boolean deleteStudent(int CustomerId)
    {
        if(this.getPatientById(CustomerId) == null)
        {
            return false;
        }
        pr.deleteById(CustomerId);
        return true;
    }



}