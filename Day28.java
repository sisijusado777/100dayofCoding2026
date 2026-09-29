import java.util.Scanner;

public class day028 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Membandingkan harga dua barang");

        System.out.print("Masukkan harga barang 1 : ");
        double barang1 = in.nextDouble();

        System.out.print("Masukkan harga barang 2 : ");
        double barang2 = in.nextDouble();

        boolean sama = barang1 == barang2;

        boolean berbeda = barang1 != barang2;

        System.out.println("Apakah harga sama?           : "+ sama);
        System.out.println("Apakah harga barang berbeda? : "+ berbeda);

        in.close();
    }
}
