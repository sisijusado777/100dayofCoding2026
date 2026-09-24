import java.util.Scanner;

public class day023 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Program menghitung luas persegi");

        System.out.print("Masukkan panjang sisi : ");
        double sisi = input.nextDouble();
        double luas = sisi * sisi;

        System.out.println("Panjang sisi    : " + sisi);
        System.out.println("Luas persegi    : " + luas);

        input.close();
    }
}
