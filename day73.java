
import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n===== WARUNG MAKAN =====");
            System.out.println("1. Bakso Bakar");
            System.out.println("2. Roti Bakar");
            System.out.println("3. Banana Roll");
            System.out.println("4. Gorengan");
            System.out.println("5. Martabak");
            System.out.println("6. Red Velvet");
            System.out.println("7. Green Tea");
            System.out.println("8. Coffee");
            System.out.println("9. Es Teh");
            System.out.println("10. Jus Jeruk");
            System.out.println("11. Keluar");

            System.out.print("Pilih pesanan Anda: ");
            pilihan = rr.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memesan Bakso Bakar");
                    break;
                case 2:
                    System.out.println("Anda memesan Roti Bakar");
                    break;
                case 3:
                    System.out.println("Anda memesan Banana Roll");
                    break;
                case 4:
                    System.out.println("Anda memesan Gorengan");
                    break;
                case 5:
                    System.out.println("Anda memesan Martabak");
                    break;
                case 6:
                    System.out.println("Anda memesan Red Velvet");
                    break;
                case 7:
                    System.out.println("Anda memesan Green Tea");
                    break;
                case 8:
                    System.out.println("Anda memesan Coffee");
                    break;
                case 9:
                    System.out.println("Anda memesan Es Teh");
                    break;
                case 10:
                    System.out.println("Anda memesan Jus Jeruk");
                    break;
                case 11:
                    System.out.println("Terima kasih telah memesan!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 11);

        rr.close();
    }
}
