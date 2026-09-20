import java.util.Scanner;

public class day19 {

    public static void main(String[] args) {
        
        Scanner rr = new Scanner(System.in);

        System.out.print("Nilai Tugas :\t");
        double nilai = rr.nextDouble();

        // KONVERSI
        byte nilai1 = (byte)nilai;

        System.out.println("Sebelum koversi =\t" + nilai);
        System.out.println("Sesudah koversi =\t" + nilai1);

    }

}
