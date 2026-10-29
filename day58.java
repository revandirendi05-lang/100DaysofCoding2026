import java.util.Scanner;

public class Day58 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

System.out.println("Genap");
for (int r = n; r>=1; r--) {
    if (r % 2 == 0)
    System.out.print(r+" ");
}
 
System.out.println("\nGanjil");
for (int r = n; r>=1; r--) {
    if (r % 2 != 0)
    System.out.print(r+" ");
}

sc.nextInt();

}
}
