import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
    Scanner rr = new Scanner(System.in);

    // MENGHITUNG LUAS PERSEGI
    System.out.print("Masukan Panjang Sisi :\t");
    double sisi = rr.nextDouble();

    double luas = sisi * sisi;

    System.out.println("Panjang sisi persegi :\t" + sisi);
    System.out.println("Luas persegi         :\t" + luas);

}

}
