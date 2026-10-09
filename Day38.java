import java.util.Scanner;

public class day038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Pembelian Tiket Bioskop");
        System.out.println();
        System.out.println("1. Regular - Rp40000");
        System.out.println("2. Swetbox - Rp60000");
        System.out.println("3. VIP     - Rp90000");

        System.out.print("\nPilih kategori (1-3) : ");
        int pilihan = in.nextInt();

        System.out.print("Jumlah tiket : ");
        int Jumlah = in.nextInt();

        String kategori = "";
        int harga = 0;

        if (pilihan == 1) {
            kategori = "Regular";
            harga = 40000;
        }else if (pilihan == 2) {
            kategori = "Sweetbox";
            harga = 60000;
        }else if (pilihan == 3) {
            kategori = "VIP";
            harga = 90000;
        }else {
            System.out.println("Kategori tidak tersedia");
            in.close();
            return; 
        }
        int total = harga * Jumlah;
        double diskon = 0;

        if (total >= 150000) {
            diskon = total * 0.15;
        }
        double totalBayar = total - diskon;

        System.out.println("\nOutput");
        System.out.println("Kategori    : "  +kategori);
        System.out.println("Harga       : Rp"+harga);
        System.out.println("Jumlah      : "  + Jumlah);
        System.out.println("Total       : Rp"+ total);
        System.out.println("Diskon      : Rp"+ (int) diskon);
        System.out.println("Total bayar : Rp"+ (int) totalBayar);

        in.close();
    }
}
