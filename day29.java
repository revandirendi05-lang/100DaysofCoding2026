import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        byte angka1 = rr.nextByte();
        byte angka2 = rr.nextByte();

        boolean prs1 = angka1 > angka2;
        boolean prs2 = angka1 < angka2;
        
        System.out.println(prs1);
        System.out.println(prs2);

        System.out.println("apakah angka1 lebih besar dari angka2 : " + (angka1 > angka2));
        System.out.println("apakah angka1 lebih kecil dari angka2 : " + (angka1 < angka2));
       
    }

}
