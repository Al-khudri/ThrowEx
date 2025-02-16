package org.example;

// Controller: Kalder model og sender exception videre
public class UserController {
    private UserModel model;

    public UserController() {

        this.model = new UserModel();
    }

    public String findUser(int id) throws Exception {
        return model.getUserById(id);
    }
}