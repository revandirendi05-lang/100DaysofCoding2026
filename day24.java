import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner rr =  new Scanner(System.in);
        System.out.print("masukan panjang persegi panjang :\t");
        double panjang = rr.nextDouble();
        System.out.print("masukan lebar persegi panjang :\t");
        double lebar = rr.nextDouble();

        double proses = panjang * lebar;

        System.out.println("HASIL :\t" + proses);
    }
}
