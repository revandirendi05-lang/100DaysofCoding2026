import java.util.Scanner;

public class tiket {
    public static void main(String[] args) {

        Scanner rr = new Scanner(System.in);

        System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
   System.out.print("Masukkan nama: ");
        String nama = rr.nextLine();
 System.out.print("Masukkan umur: ");
        byte umur = rr.nextByte();
    System.out.print("Masukkan uang yang dibawa: ");
        int uang = rr.nextInt();
      System.out.print("Apakah membawa kartu identitas : ");
        boolean kartu = rr.nextBoolean();


        boolean umurMinimal = umur >= 13;     
        boolean umurDewasa = umur > 17;      
        boolean umurAnak = umur < 13;  

        boolean uangcukup = uang >= 50000;      
        boolean uangPas = uang == 50000;        
        boolean uangTidakPas = uang != 50000;   

       
        boolean bolehMasuk = umurMinimal && uangcukup;

        boolean kartuidentitas = umurDewasa || kartu;

        boolean tidakMembawaKartu = !kartu;

         System.out.println("\n===== HASIL PEMERIKSAAN =====");

        System.out.println("Nama              : " + nama);
        System.out.println("Umur              : " + umur);
        System.out.println("Uang              : Rp" + uang);
        System.out.println("Bawa kartu        : " + kartu);

      System.out.println("Umur >= 13        : " + umurMinimal);
        System.out.println("Umur > 17         : " + umurDewasa);
        System.out.println("Umur < 13         : " + umurAnak);
    
 System.out.println("Uang >= 50000     : " + uangcukup);
        System.out.println("Uang == 50000     : " + uangPas);
        System.out.println("Uang != 50000     : " + uangTidakPas);

        System.out.println("Umur DAN uang     : " + bolehMasuk);
        System.out.println("Tidak bawa kartu  : " + tidakMembawaKartu);

        System.out.println("\n===== KEPUTUSAN =====");

        System.out.println("Boleh masuk       : " + bolehMasuk);

    }
}
