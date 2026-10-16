import java.util.Scanner;

public class day045 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Menu Pilihan");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Ayam GEprek");
        System.out.println("4. Bakso");

        System.out.println("Masukkan pilihan : ");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Menu : Nasi goreng");
                System.out.println("Harga : Rp15000");
                break;
            case 2 :
                System.out.println("Menu : Mie Ayam");
                System.out.println("Harga : Rp20000");
                break;
            case 3 :
                System.out.println("Menu : Ayam Geprek");
                System.out.println("Harga : Rp30000");
                break;
            case 4 :
                System.out.println("Menu : Bakso");
                System.out.println("Harga : Rp15000");   
                break;     
            default:
                System.out.println("Pilihan Tidak ada");
                break;
        }

        in.close();
    }
}
