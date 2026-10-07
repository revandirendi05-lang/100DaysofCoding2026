import java.util.Scanner;

public class day32 {

    public static void main(String[] args) {

        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int A = rr.nextInt();

        if (A % 2 == 0) {
            System.out.println(A + "\t GENAP");
        } else {
            System.out.println(A + "\t GANJIL");
        }
    }
}
