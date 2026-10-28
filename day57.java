
import java.util.Scanner;

public class AngkaGanjilGenap {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int n = rr.nextInt();

        System.out.println("Angka ganjil:");
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\nAngka genap:");
        int j = 1;
        while (j <= n) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }

    
    }
}
