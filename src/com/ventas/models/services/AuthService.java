
package com.ventas.models.services;

import com.ventas.models.db.Data;
import com.ventas.models.entities.User;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class AuthService {
    
    Data db = Data.getInstance();
    
    public User validUser(String username, String password, String role) {
        
        List<User> users = db.getUsers().stream().filter(u -> u.getRole().equals(role)).collect(Collectors.toCollection(LinkedList::new));
        
        for (User user : users) {
            
            if (user.getUsername().equals(username)) { 
                
                if (user.getPassword().equals(password)) return user;
                
                else return null;
                                
            } else return null;
        }
        return null;
    }
    
    public User registerUser(String name, String lastname, String position, String birthdate, String gender, String username, String email, String password) {
        User user = new User(name, lastname, position, birthdate, gender, username, email, password);
        db.addUser(user);
        return user;
    }
    
}
