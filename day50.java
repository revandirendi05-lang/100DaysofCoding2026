
import java.util.Scanner;

public class GGT {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int angka = rr.nextInt();

        String hasil = (angka % 2 ==0) ? "Genap" : "Ganjil";

        System.out.println(hasil);
    }
}
