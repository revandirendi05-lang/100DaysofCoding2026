import java.util.Scanner;

public class ContohWhile {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int pin = 0;

        while (pin != 1234) {
            System.out.print("Masukkan PIN: ");
            pin = rr.nextInt();
        }

        System.out.println("PIN benar!");
       
    }
}
