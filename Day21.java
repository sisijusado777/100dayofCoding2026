import java.util.Scanner;

public class day021{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Konversi string ke tipe data primitif");

        System.out.print("Masukkan angka bilangan bulat : ");
        String stringAngka = input.nextLine();

        System.out.print("Masukkan angka bilangan pecahan : ");
        String stringPecahan = input.nextLine();

        System.out.print("Masukkan nilai boolean True/False : ");
        String stringStatus = input.nextLine();

        int angka = Integer.parseInt(stringAngka);
        double pecahan = Double.parseDouble(stringPecahan);
        boolean status = Boolean.parseBoolean(stringStatus);

        System.out.println("String angka        : " + stringAngka);
        System.out.println("Menjadi int         : " + angka);

        System.out.println("String pecahan      : " + stringPecahan);
        System.out.println("Menjadi double      : " + pecahan);

        System.out.println("String boolean      : " + stringStatus);
        System.out.println("Menjadi boolean     : " + status);

        input.close();
    }
}
