import java.util.Scanner;

public class day13 {

    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);
        
        System.out.println("masukan nama lengkap");
        String nama1 = rr.nextLine();

        System.out.println("masukan nama panggilan");
        String nama2 = rr.nextLine();

        System.out.println("masukan umur");
        byte umur = rr.nextByte();

        System.out.println("masukan tinggi badan");
        double tinggibadan = rr.nextDouble();

        System.out.println("nama saya :" +nama1 + ",kamu bisa panggil saya :" +nama2 + ",umur saya :" + umur + ",tinggi saya :" + tinggibadan);

    } 

}
