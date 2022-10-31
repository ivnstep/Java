import java.util.Arrays;
import java.util.Random;

public class TesterC {
    private Circle[] ar;
    private int l;

    public TesterC() {
        Random r = new Random();
        l = r.nextInt(99) + 1;
        ar = new Circle[l];
        for (int i = 0; i < ar.length; ++i) {
            Point p = new Point();
            p.setXY(r.nextInt(), r.nextInt());
            ar[i] = new Circle();
            ar[i].setC(p);
            ar[i].setR(r.nextInt(1000) + 1);
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

    public Circle min () {
        int min = 0;
        double c = ar[0].getR();
        for (int i = 1; i < l; ++i) {
            if (c < ar[i].getR()) {
                min = i;
                c = ar[i].getR();
            }
        }
        return ar[min];
    }

    public Circle max () {
        int max = 0;
        double c = ar[0].getR();
        for (int i = 1; i < l; ++i) {
            if (c > ar[i].getR()) {
                max = i;
                c = ar[i].getR();
            }
        }
        return ar[max];
    }

    public void sort () {
        Circle c = new Circle();
        for (int i = 0; i < l; ++i) {
            for (int j = 1; j < l; ++j) {
                if (ar[j].getR() < ar[j-1].getR()) {
                    c = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = c;
                }
            }
        }
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
