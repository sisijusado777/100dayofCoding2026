import java.util.Scanner;

public class day019 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Konversi Manual/Paksa");

        System.out.print("Masukkan Nilai Double : ");
        double nilaiDouble =input.nextDouble();

        float nilaiFloat = (float) nilaiDouble;

        long nilaiLong =(long) nilaiFloat;
        
        int nilaiInt = (int) nilaiLong;

        byte nilaiByte = (byte) nilaiInt;

        System.out.println("Nilai double    : " + nilaiDouble);
        System.out.println("Nilai Float     : " + nilaiFloat);
        System.out.println("Nilai Long      : " + nilaiLong);
        System.out.println("Nilai Int       : " + nilaiInt);
        System.out.println("Nilai Byte      : " + nilaiByte);

        input.close();

    }
}
