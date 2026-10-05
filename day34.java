import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner rr = new  Scanner(System.in);

        int jam = rr.nextInt(); 

        System.out.println("===== TARIF PARKIR =====");

        if (jam <=1 ) {
            System.out.println("2000");
        } else if (jam <= 3) {
            System.out.println("6000");
        } else if (jam <= 5) {
            System.out.println("10000");
        } else {
            System.out.println("15000");
        }
    }

}
