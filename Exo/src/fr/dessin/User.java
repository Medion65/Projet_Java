package fr.dessin;

import fr.dessin.controllers.UsersControllers;

public class User {
    public User() {
        UsersControllers usersController = new UsersControllers();
        usersController.start();
    }

}
