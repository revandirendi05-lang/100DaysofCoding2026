import java.util.Scanner;

public class soalm4 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int pilihan = rr.nextInt();
        int sp = rr.nextInt();

        if ( pilihan == 1){
            System.out.println("Paket : Harian 3GB");
            if (sp > 10000) {
                System.out.println("Status : Berhasil");
                int a = sp - 10000;
                System.out.println("Sisa pulsa : Rp" + a);
            }
        } else if ( pilihan == 2 ) {
            System.out.println("Paket : Mingguan 15GB");
            if (sp > 35000) {
                System.out.println("Status : Berhasil");
            }else { 
                System.out.println("Pulsa tidak cukup");
            }
                int b = 35000 - sp;
                System.out.println("Sisa pulsa : Rp" + b);
            } else if ( pilihan == 3 ) {
            System.out.println("Paket : Bulanan 50GB");
            if (sp > 90000) {
                System.out.println("Status : Berhasil");
            }else { 
                System.out.println("Pulsa tidak cukup");
            }
                int c = sp - 90000;
                System.out.println("Sisa pulsa : Rp" + c);


        } else { System.out.println("Pilihan tidak valid"); }

}
}
