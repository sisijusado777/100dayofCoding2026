import java.util.Scanner;

public class day040 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Pendaftaran Member GYM");
        System.out.println("1. Reguler - Rp150000");
        System.out.println("2. Silver  - Rp300000");
        System.out.println("3. Gold    - Rp500000");

        System.out.print("Pilih kategori member : ");
        int km = in.nextInt();

        System.out.print("Durasi bulan : ");
        int durasi = in.nextInt();

        String kategori = "";
        int biaya = 0;

        if (km == 1) {
            kategori = "Regular";
            biaya = 150000;
        }else if (km == 2) {
            kategori = "Silver";
            biaya = 300000;
        }else if (km == 3) {
            kategori = "Gold";
            biaya = 500000;
        }else {
            System.out.println("Kategori tidak tersedia");
            in.close();
            return; 
        }

        int total = biaya * durasi;
        int diskon = 0;

        if((km == 3 && durasi >= 3) || (total >= 1000000)) {
            diskon = (int) (total * 0.25);
        }

        int totalBayar = total - diskon;

        String bonus = "Tidak ada bonus";

        if (km == 3) {
            if (durasi >= 6) {
                bonus = "Tas Gym Eksklusif";
            }else{
                bonus = "Handuk Sport";
            }
        }else if (km == 2) {
            if (durasi >= 4) {
                bonus = "Botol Tumbler";
            }else {
                bonus = "Kaos Kaki Sport";
            }
        }

        System.out.println("\nOutput");
        System.out.println("Kategori        : "  + kategori);
        System.out.println("Biaya perbulan  : Rp"+ biaya);
        System.out.println("Durasi          : "  + durasi + "bulan");
        System.out.println("Total           : Rp"+ total);
        System.out.println("Diskon          : Rp"+ diskon);
        System.out.println("Total Bayar     : Rp"+ totalBayar);
        System.out.println("Bonus           : "  + bonus);

        in.close();
    }    
}
