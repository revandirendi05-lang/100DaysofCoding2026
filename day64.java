
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = rr.nextInt();

        int hasil = 1;
        int i = 1;

        while (i <= angka) {
            hasil = hasil * i;
            i++;
        }

        System.out.println("Hasil faktorial: " + hasil);
    }
}
