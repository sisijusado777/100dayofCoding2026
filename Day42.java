import java.util.Scanner;

public class day042 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gajiPokok = in.nextDouble();

        double tunjangan = in.nextDouble();

        double potongan = in.nextDouble();

        double gajiKotor = gajiPokok + tunjangan;
        double gajiBersih = gajiKotor - potongan;

        System.out.println("\nHasil Perhitungan Gaji");
        System.out.println("Gaji pokok  : Rp"+ gajiBersih);
        System.out.println("Tunjangan   : Rp"+ tunjangan);
        System.out.println("Gaji kotor  : Rp"+ gajiKotor);
        System.out.println("Potongan    : Rp"+ potongan);

        if(gajiBersih > 0) {
            System.out.println("Gaji Bersih : "+ gajiBersih);
        } else {
            System.out.println("Gaji Bersih : Rp"+ gajiBersih);
            System.out.println("Peringatan : Gaji bersih tidak positif");
        }
        in.close();
    }    
}
