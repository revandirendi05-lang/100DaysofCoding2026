import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        // == sama dengan 

        System.out.println("Masukan angka pertama");
        byte A = rr.nextByte();

        System.out.println("Masukan angka kedua");
        byte B = rr.nextByte();

        // != tidak sama dengan

        System.out.println("Masukan angka ketiga");
        byte C = rr.nextByte();

        System.out.println("Masukan angka keempat");
        byte D = rr.nextByte();

        System.out.println("nilai A sama dengan B       : " + (A == B));
        System.out.println("nilai C tidak sama dengan D : " + (C != D));
    
    }

}
