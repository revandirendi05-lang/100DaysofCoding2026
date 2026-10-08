import java.util.Scanner;
public class day37{
  public static void main (String[ ]args){
Scanner rr = new Scanner(System.in);
int angka = rr.nextInt();

    if (angka >0) {
      System.out.println("Positif");
    } else if (angka < 0) {
      System.out.println("Negatif");
    } else {
      System.out.println("0");
    }
  }
}
