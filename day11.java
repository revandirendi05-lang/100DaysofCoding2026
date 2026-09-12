import java.util.Scanner;

public class projec {
public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 System.out.print("Masukkan nama = ");
 String nama = sc.nextLine();
 System.out.print("Masukkan umur = ");
 byte umur = sc.nextByte();
 System.out.print("Masukkan Tahun Kelahiran = ");
 short thnkelahiran = sc.nextShort();
  System.out.print("Masukkan NIS = ");
 int NIS = sc.nextInt();
 System.out.print("Masukkan NISN = ");
 long NISN = sc.nextLong();
 System.out.print("Masukkan tinggi badan = ");
 float tinggi = sc.nextFloat();
 System.out.print("Masukkan berat badan = ");
 double berat = sc.nextDouble();
  System.out.print("Apakah 5 lebih kecil dari 2 = ");
 boolean QUIZ = sc.nextBoolean();
 System.out.print("Masukkan jenis kelamin (L/P) = ");
 char jenisKelamin = sc.next().charAt(0);


 
 System.out.println("\n============== DATA SISWA ==============");
 System.out.println("Nama            =\t" + nama );
 System.out.println("Umur            =\t" + umur + " tahun");
 System.out.println("Tahun Kelahiran =\t" + thnkelahiran);
 System.out.println("Jenis Kelamin   =\t" + jenisKelamin);
 System.out.println("NIS             =\t" + NIS);
 System.out.println("NISN            =\t" + NISN);
 System.out.println("Tinggi Badan    =\t" + tinggi + " cm");
 System.out.println("Berat Badan     =\t" + berat + " kg");
 System.out.println("QUIS            =\t" + QUIZ);

 sc.close();


}
}
