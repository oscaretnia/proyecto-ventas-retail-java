/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.models;

/**
 *
 * @author oscaretnia
 */
public class Delivery {
    
    private String name;
    private String lastname;
    private String address;
    private String home;
    private String methodPayment;

    public Delivery(String name, String lastname, String address, String home, String methodPayment) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.home = home;
        this.methodPayment = methodPayment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getMethodPayment() {
        return methodPayment;
    }

    public void setMethodPayment(String methodPayment) {
        this.methodPayment = methodPayment;
    }
    
    
    
}
