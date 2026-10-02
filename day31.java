import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {

        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = rr.nextInt();

        System.out.print("Apakah memiliki kartu pelajar? :");
        boolean kartuPelajar = rr.nextBoolean();

        System.out.print("Apakah sedang libur? : ");
        boolean libur = rr.nextBoolean();

        // AND
        boolean syaratUmur = umur >= 17 && kartuPelajar;

        // OR (||)
        boolean masuk = syaratUmur || libur;

        // NOT (!)
        boolean tidakLibur = !libur;

        System.out.println("\n=== HASIL ===");
        System.out.println("Syarat umur dan kartu: " + syaratUmur);
        System.out.println("Boleh masuk: " + masuk);
        System.out.println("Tidak sedang libur: " + tidakLibur);

     
    }
}
