import java.util.Random;

public class lab3_3 {
    public static void main(String[] args) {
        int []a = new int[4];
        Random r = new Random();
        boolean b = true;
        int s = 0;
        for (int i = 0; i < a.length; ++i) {
            a[i] = r.nextInt(99) + 10;
            if (a[i] < s) b = false;
            s = a[i];
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(b);
    }
}
