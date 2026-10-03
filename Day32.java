import java.util.Scanner;

public class day032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nilai akhir : ");
        double na = in.nextDouble();

        System.out.print("Presentase kehadiran : ");
        double pk = in.nextDouble();

        boolean lulus = na >= 70 && pk >= 75;

        System.out.println("Lulus ? : "+ lulus);

        in.close();
    }
    
}
