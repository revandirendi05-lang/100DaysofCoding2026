public class Biodata {
    
    public static void main(String[] args) {
        String nama = "Rendi Revandi";
        int umur = 17;
        String tempatlahir = "Kalumammang";
        String tanggallahir = "15 September 2008";
        String NIM = "D0226019";
        String Prodi = "Informatika";
        double tinggibadan = 158.5;
        int beratbadan = 50;
        String Hobi = "Menulis dan main game";
        String alamat = "Karossa";
        String jeniskelamin = "laki laki";
        String Asalsekolah = "SMAN 1 Karossa";
        
        // println digunakan untuk menampilkan sesuatu lalu pindah ke baris berikutnya
        System.out.println("===== BIODATA DIRI =====");
        System.out.println("Nama           : " + nama);
        System.out.println("Umur           : " + umur);
        System.out.println("Tempat lahir   : " + tempatlahir);
        System.out.println("Tanggal lahir  : " + tanggallahir);
        System.out.println("NIM            : " + NIM);
        System.out.println("Prodi          : " + Prodi);
        
        // print digunakan untuk menampilkan sesuatu tanpa pindah baris
        System.out.print("Tinggi badan   : ");
        System.out.println(tinggibadan);
        System.out.print("Berat badan    : ");
        System.out.println(beratbadan);
        System.out.print("Hobi           : ");
        System.out.println(Hobi);
        System.out.print("Alamat         : ");
        System.out.println(alamat);
        System.out.print("Jenis kelamin  : ");
        System.out.println(jeniskelamin);
        System.out.print("Asal sekolah   : ");
        System.out.println(Asalsekolah);
        
        // printf digunakan untuk format tertentu
        System.out.printf(
            "Nama saya %s, umur %d, prodi %s, NIM %s, tinggi badan %.1f, berat badan %d, Hobi %s%n",
            nama, umur, Prodi, NIM, tinggibadan, beratbadan, Hobi
        );
        
        System.out.println("======================");
    }
}
