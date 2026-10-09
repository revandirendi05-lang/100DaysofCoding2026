import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.print("Pilih menu (1-3): ");

        int pilihan = rr.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng");
            System.out.println("Harga: Rp15.000");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Ayam");
            System.out.println("Harga: Rp12.000");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Bakso");
            System.out.println("Harga: Rp10.000");
        } else {
            System.out.println("Pilihan tidak tersedia!");
        }

    }
}
