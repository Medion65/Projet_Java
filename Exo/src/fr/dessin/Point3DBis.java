package fr.dessin;

public class Point3DBis {
    private Point2D point2D;
    private Integer z;

    public Point3DBis() {
        this.point2D = new Point2D();
    }

    public Point3DBis(Integer x, Integer y, Integer z) {
        this.point2D.setX(x);
        this.point2D.setY(y);
        this.setZ(z);
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }
}
