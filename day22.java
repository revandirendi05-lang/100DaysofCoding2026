import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
    Scanner rr = new Scanner(System.in);

    // penukaran 2 variabel
      int A = rr.nextInt();
      int B = rr.nextInt();

System.out.println("sebelum di tukar");
System.out.println("A =" + A);
System.out.println("B =" + B);

int rev = A;
 A = B;
 B = rev;

System.out.println("setelah ditukar");
System.out.println("A =" + A);
System.out.println("B =" + B);

// pertukaran 3 variabel 
int C = rr.nextInt();
int D = rr.nextInt();
int E = rr.nextInt();

System.out.println("sebelum ditukar");
System.out.println("C =" + C);
System.out.println("D =" + D);
System.out.println("E =" + E);

int van = C;
C = D;
D = E;
E = van; 

System.out.println("setelah ditukar");
System.out.println("C =" + C);
System.out.println("D =" + D);
System.out.println("E =" + E);

}

}
