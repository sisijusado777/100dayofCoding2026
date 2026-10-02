import java.util.Scanner;

public class day031 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas          : ");
        double nt = in.nextDouble();

        System.out.print("Masukkan nilai kehadiran      : ");
        double nk = in.nextDouble();

        System.out.print("Sudah membayar? (true/false) : ");
        boolean sm = in.nextBoolean();

        boolean mn = nt >= 70 && nk >= 75;
        boolean pv = !(!sm);

        boolean hasil = mn || pv;

        System.out.println("Hasil : "+ hasil);

        in.close();
    }
}
