package fr.dessin;

public class Point3D extends Point2D{
    private Integer z;

    public Point3D() {
    }

    public Point3D(Integer vX, Integer vY, Integer vZ) {
        super(vX, vY);
        this.setZ(z);
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public void translater(int dx, int dy, int dz) {
        super.translater(dx, dy);
        this.setZ(this.getZ() + dz);
    }

    public String toString() {
        return "[" + this.getX() + "," + this.getY() + "," + this.getZ() + "]";
    }

    public int hashCode() {
        return this.z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            return false;
        }
    }
}
