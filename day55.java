import java.util.Scanner;

public class ContohKeyword {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batas = rr.nextInt();

        System.out.println("\n=== CONTINUE ===");
        for (int i = 1; i <= batas; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\n=== BREAK ===");
        for (int i = 1; i <= batas; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\n=== RETURN ===");
        System.out.print("Masukkan angka pertama: ");
        int a = rr.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = rr.nextInt();

        int hasil = tambah(a, b);
        System.out.println("Hasil penjumlahan: " + hasil);

        rr.close();
    }

    static int tambah(int a, int b) {
        return a + b;
    }
}
