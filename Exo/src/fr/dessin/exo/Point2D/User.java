package fr.dessin.exo.Point2D;

import fr.dessin.exo.Point2D.controllers.UsersControllers;

public class User {
    public User() {
        UsersControllers usersController = new UsersControllers();
        usersController.start();
    }

}
