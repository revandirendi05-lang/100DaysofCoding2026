
import java.util.Scanner;

public class Spanduk {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int pilihan = rr.nextInt();
            int n = rr.nextInt();
            String s = rr.next();

            if (n < 1) {
                System.out.println("Ukuran tidak valid");
            }

            else if (pilihan == 1) {
                for (int i = 1; i <= n; i++) {
                    System.out.println(s);
                }
            } else if (pilihan == 2) {
                for (int i = 1; i <= n; i++) {
                    System.out.print(s + " ");
                }
            } else if (pilihan == 3) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            } else {
            System.out.println("Pilihan tidak valid");
        }

    }
}


import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int n = rr.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (i == 1 || i == n || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        rr.close();
    }
}
