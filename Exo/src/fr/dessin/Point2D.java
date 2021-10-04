package fr.dessin;

public class Point2D {
    private Integer x;
    private Integer y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(Integer vX, Integer vY) {
        this.x = vX;
        this.y = vY;
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
