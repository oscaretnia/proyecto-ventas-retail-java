
package models;

import java.util.LinkedList;
import java.util.List;


public class Data {
    
    private static Data instance;
    
    List<User> users;
    
    private Data() {
        users = new LinkedList<>();
    }
    
    public List<User> get() {
        return this.users;
    }
    
    public void add(User usuario) {
        this.users.add(usuario);
    }
    
    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }
    
}
