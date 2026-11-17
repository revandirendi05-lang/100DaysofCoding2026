
import java.util.Scanner;

public class LatihanString {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = rr.nextLine();

        System.out.print("Masukkan tempat lahir: ");
        String tempat = rr.nextLine();

        System.out.print("Masukkan hobi: ");
        String hobi = rr.nextLine();

        System.out.println("\n=== HASIL BIODATA ===");

        System.out.println("Jumlah karakter: " + nama.length());

        System.out.println("Huruf kapital: " + nama.toUpperCase());

        System.out.println("Huruf kecil: " + nama.toLowerCase());

        System.out.println("Nama sama dengan Rendi: "
                + nama.equals("Rendi Revandi"));

        System.out.println("Nama sama (abaikan huruf): "
                + nama.equalsIgnoreCase("rendi revandi"));

        System.out.println("Mengandung kata Rendi: "
                + nama.contains("Rendi"));

        System.out.println("Nama kosong: " + nama.isEmpty());

        if (nama.length() >= 3) {
            System.out.println("3 huruf pertama: "
                    + nama.substring(0, 3));
        }

        System.out.println("Hobi setelah diganti: "
                + hobi.replace("game", "olahraga"));

        System.out.println("Tempat lahir: " + tempat.trim());

    }
}

