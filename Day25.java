import java.util.Scanner;

public class day025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program menghitung luas lingkaran");
        System.out.print("Masukkan jari-jari : ");
        double jj = input.nextDouble();

        double luas = Math.PI * jj * jj;

        System.out.println("Jari-jari   : " + jj);
        System.out.println("Nilai PI    : " + Math.PI);
        System.out.println("Luas    : " + luas);

        input.close();
    }
    
}
