
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int angka1, angka2;
        char operator;
        int hasil;

        System.out.print("Masukkan angka pertama: ");
        angka1 = rr.nextInt();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        operator = rr.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = rr.nextInt();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '/':
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                break;

            case '%':
    
                    hasil = angka1 % angka2;
                    System.out.println("Sisa bagi: " + hasil);
                
                break;

            default:
                System.out.println("Operator tidak valid!");
        }

       
    }
}
