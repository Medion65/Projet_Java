package fr.dessin.exo.Point2D;

public class Main {

    public static void main(String[] args) {

        Point2D point2D = new Point2D();
        point2D.afficher();
        point2D.translater(30, 40);

        System.out.println(point2D.getX());
        System.out.println(point2D.getY());

    }
}
