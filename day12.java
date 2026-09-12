import java.util.Scanner;

public class biodata {
public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 System.out.print("Masukkan nama = ");
 String nama = sc.nextLine();
 System.out.print("Masukkan Bulan lahir = ");
 String bulanlahir = sc.nextLine();
 System.out.print("Masukkan status = ");
 String status = sc.nextLine();
 System.out.print("Masukkan alamat = ");
 String alamat = sc.nextLine();


 System.out.print("Masukkan umur = ");
 byte umur = sc.nextByte();
 System.out.print("Masukkan tanggal lahir = ");
 byte tanggallahir = sc.nextByte();

 System.out.print("Masukkan Tahun Kelahiran = ");
 short thnkelahiran = sc.nextShort();

  System.out.print("Masukkan NIS = ");
 int NIS = sc.nextInt();

 System.out.print("Masukkan NISN = ");
 long NISN = sc.nextLong();
 System.out.print("Masukkan NIK = ");
 long NIK = sc.nextLong();

 System.out.print("Masukkan tinggi badan = ");
 float tinggi = sc.nextFloat();

 System.out.print("Masukkan berat badan = ");
 double berat = sc.nextDouble();

 System.out.print("WNI = ");
 boolean WNI = sc.nextBoolean();

 System.out.print("Masukkan jenis kelamin (L/P) = ");
 char jenisKelamin = sc.next().charAt(0);
 System.out.print("Masukan golongan darah = ");
 char golda = sc.next().charAt(0);


 
 System.out.println("\n============== DATA SISWA ==============");
 System.out.println("NAMA            =\t" + nama );
 System.out.println("UMUR            =\t" + umur + " tahun");
 System.out.println("TANGGAL LAHIR   =\t" + tanggallahir );
 System.out.println("BULAN LAHIR     =\t" + bulanlahir);
 System.out.println("TAHUN KELAHIRAN =\t" + thnkelahiran);
 System.out.println("JENIS KELAMIN   =\t" + jenisKelamin);
 System.out.println("ALAMAT          =\t" + alamat);
 System.out.println("NOMOR INDUK     =\t" + NIK);
 System.out.println("NIS             =\t" + NIS);
 System.out.println("NISN            =\t" + NISN);
 System.out.println("STATUS          =\t" + status);
 System.out.println("TINGGI BADAN    =\t" + tinggi + " cm");
 System.out.println("BERAT BADAN     =\t" + berat + " kg");
 System.out.println("GOLONGAN DARAH  =\t" + golda);
 System.out.println("APAKAH ANDA WNI =\t" + WNI);
 System.out.println("\n=========================================");

 sc.close();


}
   }
