package org.example;

// Model: Kaster en exception
public class UserModel {
    public String getUserById(int id) throws Exception {
        if (id <= 0) {
            throw new IllegalArgumentException("ID skal være større end 0!");
        }
        return "Bruger #" + id;
    }
}