
import java.util.Scanner;

public class AngkaMinimal {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int n;

        System.out.print("Masukkan jumlah elemen: ");
        n = rr.nextInt();

        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = rr.nextInt();
        }

        int minimal = angka[0];

        for (int i = 1; i < n; i++) {
            if (angka[i] < minimal) {
                minimal = angka[i];
            }
        }

        System.out.println("Angka minimal adalah: " + minimal);
    }
}
