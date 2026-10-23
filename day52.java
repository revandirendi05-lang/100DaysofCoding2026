
import java.util.Scanner;

public class WhileScanner {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batas = rr.nextInt();

        int i = rr.nextInt();

        while (i <= batas) {
            System.out.println("Angka: " + i);
            i++;
        }

       
    }
}
