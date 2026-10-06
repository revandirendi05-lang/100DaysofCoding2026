import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {

        Scanner rr = new Scanner(System.in);

        System.out.print("masukan umur: ");
        int umur = rr.nextInt();
        System.out.print("masuka tinggi: ");
            int tinggi = rr.nextInt();

        if (umur >= 12) {

            if (tinggi >= 140) {
                System.out.println("BOLEH NAIK");
            } else {
                System.out.println("TIDAK BOLEH NAIK");
            }

        } else {
            System.out.println("UMUR TIDAK MEMENUHI");
        }
    }
}
