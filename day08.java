public class day8 {

    public static void main(String[] args) {
        
        // Deklarasi, Inisialisasi, dan Updete

        // ===== DEKLARASI =====
        String nama;
        int umur;
        double tinggibadan;
        int beratbadan;

        // ===== Inisialisasi =====
        nama = "Rendi Revandy";
        umur = 17;
        tinggibadan = 150.5; 
        beratbadan = 50;

        // menampilkan data awal 
        System.out.println("============= BIODATA =============");
        System.out.println("Nama              : " +nama);
        System.out.println("Umur              : " +umur);
        System.out.println("Tinggi Badan      : " +tinggibadan);
        System.out.println("Berat Badan       : " +beratbadan);
        System.out.println("===================================");

        // ====== UPDATE ======
        umur = 18;
        tinggibadan = 157.5;
        beratbadan = 55;

        // Data setelah di update
        System.out.println("\n===== DATA SETELAH DI UPDATE =====");
        System.out.println("Nama              : " +nama);
        System.out.println("Umur              : " +umur);
        System.out.println("Tinggi Badan      : " +tinggibadan);
        System.out.println("Berat Badan       : " +beratbadan);
        System.out.println("===================================");
       
    }
}
