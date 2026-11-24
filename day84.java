import java.util.Scanner;

public class MaksimalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = input.nextInt();

        int[] angka = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        int maksimal = angka[0];
        for (int i = 1; i < n; i++) {
            if (angka[i] > maksimal) {
                maksimal = angka[i];
            }
        }

        System.out.println("\nAngka terbesar adalah: " + maksimal);

    }
}
