package fr.dessin;

public class Main {

    public static void main(String[] args) {

        Point2D point2D = new Point2D();
        point2D.setX(4);
        point2D.setY(10);
        point2D.afficher();
        point2D.translater(30, 40);

        System.out.println(point2D.getX());
        System.out.println(point2D.getY());

    }
}
