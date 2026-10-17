import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Es Teh");
        System.out.print("Pilih menu: ");

        int pilihan = rr.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Nasi Goreng - Rp15000");
                break;

            case 2:
                System.out.println("Mie Ayam - Rp12000");
                break;

            case 3:
                System.out.println("Es Teh - Rp5000");
                break;

            default:
                System.out.println("Menu tidak tersedia");
        }

        
    }
}
