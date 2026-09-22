import java.util.Scanner;

public class day21 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.println("Masukan nama");
        String nama = rr.nextLine();

        System.out.println("Masukan umur");
        String umur = rr.nextLine();

        System.out.println("Masukan tahun lahir");
        String tahun = rr.nextLine();

        System.out.println("Masukan NISN");
        String nisn = rr.nextLine();

        System.out.println("Masukan NIK");
        String nik = rr.nextLine();

        System.out.println("Masukan berat badan");
        String berat = rr.nextLine();

        System.out.println("Masukan tinggi badan");
        String tinggi = rr.nextLine();

        System.out.println("Masukan jenis kelamin");
        String jenis = rr.nextLine();

        System.out.println("apakah bumi itu bulat");
        String pendapat = rr.nextLine();

        // mengubah String ke tipe data primitif

        byte A = Byte.parseByte(umur);
        short B = Short.parseShort(tahun);
        int C = Integer.parseInt(nisn);
        long D = Long.parseLong(nik);
        float E = Float.parseFloat(berat);
        double F = Double.parseDouble(tinggi);
        char G = jenis.charAt(0);
        boolean H = Boolean.parseBoolean(pendapat);

        System.out.println("======== BIODATA SISWA ========");
        System.out.println("Nama Siswa            :\t" + nama);
        System.out.println("Umur                  :\t" + A);
        System.out.println("Tahun lahir           :\t" + B);
        System.out.println("NISN                  :\t" + C);
        System.out.println("NIK                   :\t" + D);
        System.out.println("Berat Badan           :\t" + E);
        System.out.println("Tinggi Badan          :\t" + F);
        System.out.println("Jenis Kelamin         :\t" + G);
        System.out.println("Apakah bumi itu bulat :\t" + H);
        System.out.println("===============================");
    }

}
