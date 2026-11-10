
import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan tinggi: ");
        int n = rr.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
