import java.util.Scanner;

public class day027 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Operator increment dan decrement");

        System.out.print("Masukkan nilai awal : ");
        int angka = in.nextInt();

        System.out.println("Nilai awal : "+ angka);

        angka++;
        System.out.println("Setelah ++  : "+ angka);

        angka --;
        System.out.println("Setelah --  : "+ angka);

        in.close();
    }
}
