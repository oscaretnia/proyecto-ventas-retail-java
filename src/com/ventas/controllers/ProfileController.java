/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.controllers;

import com.ventas.models.entities.User;
import com.ventas.models.services.ProfileService;
import com.ventas.views.admin.ProfileView;

/**
 *
 * @author Pony
 */

public class ProfileController {
    
    private final ProfileService model;
    private final ProfileView view;

    public ProfileController(ProfileView view) {
        this.model = new ProfileService();
        this.view = view;
    }
    
    public void modifyProfile(String userId, String name, String lastname, String position, String birthdate, String gender, String username, String email, String password) {
        model.modifyProfile(userId, name, lastname, position, birthdate, gender, username, email, password);
        view.onSuccess();
    }
    
    public void setProfile(String username) {
        User user = model.getProfile(username);
        if (user != null) {
            view.setProfile(
                    user.getName(),
                    user.getLastname(),
                    user.getRole(),
                    user.getBirthdate(),
                    user.getGender(),
                    user.getUsername(),
                    user.getEmail(),
                    user.getPassword()
            );
        }
    }
    
    public boolean isAdmin(String username) {
        return model.getProfile(username).getRole().equals("Administrador");
    }
    
    
}
