import java.util.Scanner;

public class day029 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Membandingkan harga barang dan uang");

        System.out.print("Masukkan harga barang : ");
        double harga = in.nextDouble();

        System.out.print("Masukkan uang : ");
        double uang = in.nextDouble();

        boolean uangLebihBesar = uang > harga;
        boolean uangLebihKecil = uang < harga;

        System.out.println("Uang lebih besar dari harga : "+ uangLebihBesar);
        System.out.println("Uang lebih kecil dari harga : "+ uangLebihKecil);

        in.close();
    }
}
