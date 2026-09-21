import java.util.Scanner;

public class day020{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Konversi tipe data promitif ke string");

        System.out.print("Masukkan angka bilangan bulat         : ");
        int angka = input.nextInt();

        System.out.print("Masukkan angka bilangan pecahan       : ");
        double pecahan = input.nextDouble();

        System.out.print("Masukkan nilai boolean true/false     : ");
        boolean status = input.nextBoolean();

        String stringAngka = String.valueOf(angka);
        String stringPecahan = String.valueOf(pecahan);
        String stringStatus = String.valueOf(status);

        System.out.println("Nilai int       : " + angka);
        System.out.println("Menjadi string  : " + stringAngka);

        System.out.println("Nilai double    : " + pecahan);
        System.out.println("Menjadi string  : " + stringPecahan);

        System.out.println("Nilai boolean   : " + status);
        System.out.println("Menjadi String  : " + stringStatus);

        input.close();
    }
}
