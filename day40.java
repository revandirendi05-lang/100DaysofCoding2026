import java.util.Scanner;

public class soalm4 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int pilihan = rr.nextInt();
        int sp = rr.nextInt();

        if ( pilihan == 1 ) {
            System.out.println("Paket : Mingguan 3GB");
            if (sp >= 10000) {
                System.out.println("Status : Berhasil");
                 int S = sp - 10000;
System.out.println("Sisa pulsa :Rp" + S);
            }else { 
                System.out.println("Status : Pulsa tidak cukup");
int Q = 10000 - sp;
System.out.println("Kekurangan :Rp" + Q);
           }
                      
            } else if ( pilihan == 2 ) {
            System.out.println("Paket : Mingguan 15GB");
            if (sp >= 35000) {
                System.out.println("Status : Berhasil");
                int w = sp - 35000;
                System.out.println("Sisa pulsa :Rp" + w);
            }else { 
                System.out.println("Status : Pulsa tidak cukup");
            }
                int b = 35000 - sp;
                System.out.println("Kekurangan : Rp" + b);
            } else if ( pilihan == 3 ) {
            System.out.println("Paket : Bulanan 50GB");
            if (sp >= 90000) {
                System.out.println("Status : Berhasil");
                int h = sp - 90000;
                System.out.println("Sisa pulsa :Rp" + h);
            }else { 
                System.out.println("Status : Pulsa tidak cukup");
            }
                int c = 90000 - sp;
                System.out.println("Kekurangan : Rp" + c);


        } else { System.out.println("Pilihan tidak valid"); }

}
}
