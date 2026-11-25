import java.util.Scanner;

public class ManipulasiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};

        System.out.println("Array awal:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }

        System.out.print("Masukkan indeks: ");
        int indeks = input.nextInt();

        System.out.print("Masukkan nilai baru: ");
        int nilai = input.nextInt();

        angka[indeks] = nilai;

        System.out.println("Array setelah diubah:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
    }
}
