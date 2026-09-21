import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.println("masukkan nama barang :");
        String barang = rr.nextLine();

        System.out.println("masukkan jumlah barang :");
        int jumlah = rr.nextInt();

        System.out.println("masukkan harga barang :");
        double harga = rr.nextDouble();

        System.out.println("kode bayar");
        char kode = rr.next().charAt(0);

        System.out.println("puas dengan pelayanan");
        boolean puas = rr.nextBoolean();

        double total = jumlah * harga;

        // mengubah tipe data 
        String jumlahString = String.valueOf(jumlah);
        String hargaString = String.valueOf(harga);
        String kodeString = String.valueOf(kode);
        String puasString = String.valueOf(puas);
        String totalString = String.valueOf(total);

        System.out.println("Nama Barang                  :\t" + barang);
        System.out.println("Jumlah                       :\t" + jumlah);
        System.out.println("Harga                        :\t" + harga);
        System.out.println("Kode Barang                  :\t" + kode);
        System.out.println("Apakah puas dengan pelayanan :\t" + puas);
        System.out.println("Total Harga                  :\t" + total);

    }

}
