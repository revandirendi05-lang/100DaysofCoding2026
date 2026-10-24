
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. 55GB/28hr/140rb");
            System.out.println("2. 45GB/28hr/120rb");
            System.out.println("3. back");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            

            if (pilihan == 1) {
                System.out.println("Selamat paket 55GB/28hr/140rb telah aktif!");
            } else if (pilihan == 2) {
                System.out.println("Selamat Paket 45GB/28hr/120rb telah aktif!");
            } else if (pilihan == 3) {
                System.out.println("selesai.");
            } else {
                System.out.println("Eror.");
            }

        } while (pilihan != 3);

    }
}
