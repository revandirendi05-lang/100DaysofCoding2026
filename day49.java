
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = rr.nextInt();

        String hasil = (umur >= 17) ? "Sudah cukup umur" : "Belum cukup umur";

        System.out.println(hasil);
    }
}
