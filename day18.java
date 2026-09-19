import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.println("nilai tugas");
        byte nilai = rr.nextByte();

        // konversi
        long nilai1 = nilai;
        double nilaitugas = nilai1;

        System.out.println("Nilai Tugas :\t" + nilai1);
        System.out.println("Nilai Tugas :\t" + nilaitugas);


    }

}
