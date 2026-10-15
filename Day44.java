import java.util.Scanner;

public class day044 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa : ");
        double nilai = in.nextDouble();

        if(nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        }else if(nilai >= 85) {
            System.out.println("Predikat: A");
        }else if(nilai >= 75) {
            System.out.println("Prediksi: B");
        }else if(nilai >= 65) {
            System.out.println("Prediksi: C");
        }else if(nilai >= 50) {
            System.out.println("Predikat: D");
        }else {
            System.out.println("Predikat: E");
        }

        in.close();
    }
}
