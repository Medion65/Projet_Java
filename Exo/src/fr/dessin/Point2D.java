package fr.dessin;

public class Point2D {
    private Integer x;
    private Integer y;
    private static Integer compteur = 0;

    public Point2D() {
        this.setX(0);
        this.setY(0);
        Point2D.compteur++;
    }

    public Point2D(Integer vX, Integer vY) {
        this.setX(vX);
        this.setY(vY);
        Point2D.compteur++;
    }

    public Integer getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Permet d'afficher X et Y (toString
     */
    public void afficher()  {
        System.out.println("["
                .concat(this.getX().toString())
                .concat(",")
                .concat(this.getY().toString())
                .concat("]")
        );
    }

    public static Integer getCompteur(){
        return Point2D.compteur;
    }

    /**
     * Methode publique qui permet de translater X et Y
     * @param dx Integer
     * @param dy Integer
     */
    public void translater (int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
