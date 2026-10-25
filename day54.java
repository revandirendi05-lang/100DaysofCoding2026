
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int N = rr.nextInt();

        for (int i = 1; i <= N; i++) {
            if (( i % 3 == 0 ) != (i % 4 == 0)) {
                System.out.print(i);
            }
        }

    }
}
