import java.util.Arrays;
import java.util.Random;

public class TesterC {
    private Circle[] ar;
    private int l;

    public TesterC() {
        Random r = new Random();
        l = r.nextInt(100);
        ar = new Circle[l];
        for (int i = 0; i < ar.length; ++i) {
            Point p = new Point();
            p.setXY(r.nextInt(), r.nextInt());
            ar[i].setC(p);
            ar[i].setR(r.nextInt(1000));
        }
    }

    public TesterC(Circle[] ar) {
        this.ar = ar;
        this.l = ar.length;
    }

    public TesterC(int l) {
        this.ar = new Circle[l];
        this.l = l;
    }

    public void setAr(Circle[] ar) {
        this.ar = ar;
        this.l = ar.length;
    }

    public Circle[] getAr() {
        return ar;
    }

    public int getL() {
        return l;
    }

    void show() {
        for (int i = 0; i < l; ++i) {
            System.out.println((i+1) + " Circle:");
            Point p = new Point();
            p = ar[i].getC();
            System.out.println("x: " + p.getX() + " y: " + p.getY() + " r: " + ar[i].getR() + " color: " + ar[i].getColor());
        }
    }
}
