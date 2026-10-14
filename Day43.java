import java.util.Scanner;

public class day043 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka :");
        int angka = in.nextInt();

        if(angka % 3 == 0 && angka % 5 == 0) {
            System.out.println(angka + "adalah kelipatan 3 dan 5");
        }else if (angka % 3 == 0) {
            System.out.println(angka+ "adalah kelipatan 3");
        }else if (angka % 5 == 0) {
            System.out.println(angka + "adalah kelipatan 5");
        }else {
            System.out.println(angka + "bukan kelipatan 3 maupun 5");
        }

        in.close();
    }    
}
