import java.util.Scanner;

public class day030 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double hargaPembanding = 50000.0;
        System.out.print("Harga barang : ");
        double harga = in.nextDouble();

        boolean lebihBesarSama = harga >= hargaPembanding;
        boolean lebihKecilSama = harga <= hargaPembanding;

        System.out.println(harga + " >= " + hargaPembanding + " = " + lebihBesarSama);
        System.out.println(harga + " <= " + hargaPembanding + " = " + lebihKecilSama);

        in.close();
    }
}
