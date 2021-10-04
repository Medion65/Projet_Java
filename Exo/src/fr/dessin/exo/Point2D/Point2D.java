package fr.dessin.exo.Point2D;

public class Point2D {
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void afficher(int x, int y)  {
        System.out.println(x);
        System.out.println(y);
    }

    public void translater (int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
