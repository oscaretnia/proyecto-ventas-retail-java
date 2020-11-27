/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.models.entities;

/**
 *
 * @author oscaretnia
 */
public class Shipment {
    
    private String department;
    private String city;
    private String neighborhood;

    public Shipment(String department, String city, String neighborhood) {
        this.department = department;
        this.city = city;
        this.neighborhood = neighborhood;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }        
}
