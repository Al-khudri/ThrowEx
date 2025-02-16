package org.example;

public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController();

        try {
            String user = controller.findUser(-1); // Fejl: ID er negativt
            System.out.println(user);
        } catch (Exception e) {
            System.out.println("Fejl opstået: " + e.getMessage());
        }
    }
}