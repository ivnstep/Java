import java.util.Scanner;

public class lab3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        int count2 = 0;
        int []b = new int [count];
        for (int i = 0; i < n; ++i) {
            if (a[i] % 2 == 0) {
                b[count2]= a[i];
                count2++;
            }
        }
    }
}
