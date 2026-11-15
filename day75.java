public class LatihanString {
    public static void main(String[] args) {

        String nama = "Rendi Revandi";
        String prodi = "Informatika";
        String kosong = "";

        System.out.println(nama.equals("Rendi Revandi"));
        System.out.println(prodi.equalsIgnoreCase("INFORMATIKA"));
        System.out.println(nama.contains("Rendi"));
        System.out.println(kosong.isEmpty());
    }
}
