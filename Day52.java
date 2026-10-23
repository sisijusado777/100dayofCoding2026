import java.util.Scanner;

public class day052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();

        int i = 1;

        while (i <= 10) {
            System.out.println(i + "x" + angka + "=" + (i * angka));
            i++;
        }

        in.close();
    }
}
