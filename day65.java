
import java.util.Scanner;

public class GarisVertikal {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan jumlah garis: ");
        int n = rr.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
}
