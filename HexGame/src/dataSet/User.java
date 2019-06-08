/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSet;

import java.io.Serializable;

/**
 *
 * @author Estudiante
 */
public class User implements Serializable {
    private String password;
    private String user;

    public User(String password, String user) {
        this.password = password;
        this.user = user;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "User{" + "password=" + password + ", user=" + user + '}';
    }
    
    
}
