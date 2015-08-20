package prototype;

/**
 * Created by eugen on 20.08.2015.
 */
public class First implements Cloneable {
    private int x;
    private double y;

    public First(int x, double y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "First{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
