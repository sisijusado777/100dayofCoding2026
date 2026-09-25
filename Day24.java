import java.util.Scanner;

public class day024 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program menghitung luas persegi panjang");

        System.out.print("Masukkan panjang      : ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar        : ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;

        System.out.println("Panjang         : " + panjang);
        System.out.println("Lebar           : " + lebar);
        System.out.println("Luas            : " + luas);

        input.close();
    }
}
