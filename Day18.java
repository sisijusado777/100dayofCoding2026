import java.util.Scanner;

public class day018 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Konversi otomatis tipe data");

        System.out.print("Masukkan Nilai byte     : ");
        byte nilaiByte = input.nextByte();

        short nilaiShort = nilaiByte;

        int nilaiInt = nilaiShort;

        long nilaiLong = nilaiInt;

        double nilaiDouble = nilaiLong;

        System.out.println("Nilai byte      : " + nilaiByte);
        System.out.println("Nilai int       : " + nilaiInt);
        System.out.println("Nilai long      : " + nilaiLong);
        System.out.println("Nilai double    : " + nilaiDouble);

        input.close();
    }
}
