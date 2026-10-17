import java.util.Scanner;

public class day046 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Daftar Menu Makanan");
        System.out.println("1. Nasi Goreng (Rp15000)");
        System.out.println("2. Mie Ayam (Rp18000)");
        System.out.println("3. Bakso (Rp12000)");
        System.out.println("4. Sate (Rp16000)");
        System.out.println("5. Ayam Geprek (Rp10000)");

        System.out.print("Masukkan nomor menu yang dipilih : ");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Menu yang dipilih : Nasi Goreng");
                System.out.println("Harga : Rp15000");
                break;
            case 2:
                System.out.println("Menu yang dipilih : Mie Ayam");
                System.out.println("Harga : Rp18000");
                break;
            case 3:
                System.out.println("Menu yang dipilih : Bakso");
                System.out.println("Harga : Rp12000");
                break;    
            case 4:
                System.out.println("Menu yang dipilih : Sate");
                System.out.println("Harga : Rp16000");
                break;
            case 5:
                System.out.println("Menu yang dipilih : Ayam Geprek");
                System.out.println("Harga : Rp10000");
                break;        
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }

        in.close();
    }
}
