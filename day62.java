import java.util.Scanner;

public class NestedLoopScanner {
    public static void main(String[] args) {

        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = rr.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = rr.nextInt();

        for (int i = 1; i <= baris; i++) {

            for (int j = 1; j <= kolom; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
