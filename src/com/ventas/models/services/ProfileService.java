/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.models.services;

import com.ventas.models.db.Data;
import com.ventas.models.entities.User;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 *
 * @author oscaretnia
 */
public class ProfileService {
    
    Data db = Data.getInstance();
    
    public void modifyProfile(String id, String name, String lastname, String role, String birthdate, String gender, String username, String email, String password) {
        db.getUsers().remove(getProfile(id));
        db.addUser(new User(name, lastname, role, birthdate, gender, username, email, password));
    }
    
    public User getProfile(String username) {
        return db.getUsers().stream().filter(u -> u.getUsername().equals(username)).collect(Collectors.toCollection(LinkedList::new)).getFirst();
    }
    
}
