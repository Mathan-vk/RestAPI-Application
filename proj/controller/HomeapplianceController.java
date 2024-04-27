package com.example.proj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proj.model.Homeappliance;
import com.example.proj.service.HomeapplianceService;

@RestController
@RequestMapping("/api")
public class HomeapplianceController{
    @Autowired
    private HomeapplianceService ps;

    @PostMapping("/customer")
    public ResponseEntity<Homeappliance> createPatient(@RequestBody Homeappliance product){
        Homeappliance createdProduct=ps.createPatient(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }

    @GetMapping("/customers")
    public List<Homeappliance> getAllPatients(){
        return ps.getAllPatients();
    }

    @GetMapping("/customer/{customerId}")
    public Optional<Homeappliance> getPatientById(@PathVariable int CustomerId){
        Optional<Homeappliance> product=ps.getPatientById(CustomerId);
        return product;
    }
        @PutMapping("/customer/{customerId}")
    public ResponseEntity<Homeappliance> putMethod(@PathVariable("customerId") int customerId,@RequestBody Homeappliance l)
    {
        if(ps.updateDetails(customerId,l) == true)
        {
            return new ResponseEntity<>(l,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @DeleteMapping("/customer/{customerId}")
    public ResponseEntity<Boolean> delete(@PathVariable("customerId") int customerId)
    {
        if(ps.deleteStudent(customerId) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }

}