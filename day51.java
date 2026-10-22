import java.util.Scanner;

public class PerulanganFor {
    public static void main(String[] args) {

        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int awal = rr.nextInt();

        System.out.print("Masukkan angka akhir: ");
        int akhir = rr.nextInt();

        for (int i = awal; i <= akhir; i++) {
            System.out.println(i);
        }

      
    }
}
