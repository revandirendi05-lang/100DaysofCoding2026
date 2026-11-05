import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan nilai M: ");
        int M = rr.nextInt();

        System.out.print("Masukkan nilai N: ");
        int N = rr.nextInt();

        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }

        System.out.println(M + " pangkat " + N + " = " + hasil);
    }
}
