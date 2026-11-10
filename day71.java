
import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int n = rr.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
