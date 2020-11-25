
package com.ventas.models.services;

import com.ventas.models.Data;
import com.ventas.models.User;
import java.util.List;


public class AuthService {
    
    Data db = Data.getInstance();
    
    public User validUser(String username, String password) {
        
        List<User> users = db.getUsers();
        
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
