public class struktoko {
    public static void main(String[] args) {
     // Data barang 
     String Barang1 = "Le Mineral";
     String Barang2 = "Minyak Bimoli";
     String Barang3 = "Roma Kelapa";
     String Barang4 = "Indomie";
     String Barang5 = "Kanzler Single";

     int Harga1 = 5000;
     int Harga2 = 45000;
     int Harga3 = 14000;
     int Harga4 = 3000;
     int Harga5 = 12000;

     int Total = Harga1 + Harga2 + Harga3 + Harga4 + Harga5;

     // Judul struk 
     System.out.println("==================================================");
     System.out.println("\t\t\"TOKO BIRU\"");
     System.out.println("==================================================\n");

     //Daftar Barang
     System.out.println("01\t" + Barang1 + "\t\tRp" + Harga1);
     System.out.println("02\t" + Barang2 + "\t\tRp" + Harga2);
     System.out.println("03\t" + Barang3 + "\t\tRp" + Harga3);
     System.out.println("04\t" + Barang4 + "\t\t\tRp" + Harga4);
     System.out.println("05\t" + Barang5 + "\t\tRp" + Harga5);

     System.out.println("-------------------------------------------------");

     // Total 

     System.out.println("Total\t\t\t\tRp" + Total);

     System.out.println("\nLokasi Toko:");
     System.out.println("C:\\Toko Biru");

     System.out.println("\n\"Terima kasih telah belanja dikamin\b\"!");

     System.out.println("\'Semoga hari anda menyenangkan\'");

    /*
    * \n untuk baris baru
    * \t untuk tab
    * \" untuk menampilkan tanda petik
    * \\ untuk memasukan (\) kedalam teks
    * \r untuk kembali ke baris awal 
    * \b menghapus satu karakter dibelakang kusor
    * \' untuk menampilkan tanda ('')
     */
    }
}
