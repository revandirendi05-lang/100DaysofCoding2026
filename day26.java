import java.util.Scanner;

public class soalf {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        // Soal 1
        System.out.print("Masukkan Nama       : ");
        String nama = rr.nextLine();
        
        System.out.print("Masukkan NIM        : ");
        String nim = rr.nextLine();
        
        System.out.print("Masukkan Kelas      : ");
        char kelas = rr.next().charAt(0);
        
        System.out.print("Masukkan Umur       : ");
        int umur = rr.nextInt();
        rr.nextLine(); // Membersihkan buffer newline
        
        System.out.print("Masukkan Prodi      : ");
        String prodi = rr.nextLine();
        
        System.out.print("Masukkan IPK        : ");
        double ipk = rr.nextDouble();
        
        System.out.print("Status Keaktifan   : ");
        boolean statusAktif = rr.nextBoolean();

        System.out.println("===== BIODATA MAHASISWA =====");
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Kelas         : " + kelas);
        System.out.println("Umur          : " + umur + " Tahun");
        System.out.println("Prodi         : " + prodi);
        System.out.println("IPK           : " + ipk);
        System.out.println("Status Aktif: " + statusAktif);

    }
}

import java.util.Scanner;

public class soalf {

    // soal 2

    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        double jariJari = rr.nextDouble();
        final double pi = 3.14;
        
        double luas = pi * jariJari * jariJari;

        System.out.println(luas);

    }
}

import java.util.Scanner;

public class soalf {

    // soal 3

    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int a = rr.nextInt();
        int b = rr.nextInt();
        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println(a);
        System.out.println(b);



    }
}

  
