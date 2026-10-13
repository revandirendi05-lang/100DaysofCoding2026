import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        double gajiPokok, pajak, gajiBersih;

        System.out.print("Masukkan gaji pokok: Rp ");
        gajiPokok = rr.nextDouble();

        if (gajiPokok > 5000000) {
            pajak = gajiPokok * 10 / 100;
        } else {
            pajak = gajiPokok * 5 / 100;
        }

        gajiBersih = gajiPokok - pajak;

        System.out.println("Gaji Pokok  : Rp " + gajiPokok);
        System.out.println("Pajak       : Rp " + pajak);
        System.out.println("Gaji Bersih : Rp " + gajiBersih);

    }
}
