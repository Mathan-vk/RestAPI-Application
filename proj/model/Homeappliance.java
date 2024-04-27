package com.example.proj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Homeappliance{
    @Id
    int CustomerId;
    String CustomerName;
    String Appliance;
    String ServiceCenter;
    String Contact;
    public int getCustomerId() {
        return CustomerId;
    }
    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }
    public String getCustomerName() {
        return CustomerName;
    }
    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
    public String getAppliance() {
        return Appliance;
    }
    public void setAppliance(String appliance) {
        Appliance = appliance;
    }
    public String getServiceCenter() {
        return ServiceCenter;
    }
    public void setServiceCenter(String serviceCenter) {
        ServiceCenter = serviceCenter;
    }
    public String getContact() {
        return Contact;
    }
    public void setContact(String contact) {
        Contact = contact;
    }


}