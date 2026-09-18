import java.util.Scanner;

public class day17 {

    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("masukan nilai awal: ");
        byte nilai = rr.nextByte();

        // OPERATOR PENUGASAN
        nilai += 10;
        nilai -= 5;
        nilai *= 2;
        nilai /= 9;
        nilai %= 3;

        System.out.println("Nilai awal  :" + nilai);
        System.out.println("Nilai akhir :" + nilai);

    }

}
