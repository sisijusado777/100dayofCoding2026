import java.util.Scanner;

public class day044 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String nama = in.nextLine();

        System.out.print("Masukkan nilai : ");
        int nilai = in.nextInt();

        System.out.println("\nNama : "+ nama);
        System.out.println("Nilai  : "+ nilai);

        if(nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        }else if (nilai >= 85) {
            System.out.println("Predikat Nilai : A");
            if(nilai >= 60) {
                System.out.println("Status : Lulus");
            }else {
                System.out.println("Status : Tidak Lulus");
            }
        }else if(nilai >= 75) {
            System.out.println("Predikat Nilai : B");
            if (nilai >= 60) {
                System.out.println("Status : Lulus");
            }
        }else if (nilai >= 65) {
            System.out.println("Predikat Nilai : C");
            if(nilai >= 60) {
                System.out.println("Status : Lulus");
            }else {
                System.out.println("Status : Tidak Lulus");
            }
        }else if(nilai >= 50) {
            System.out.println("Prediksi Nilai : D");
            if(nilai >= 60) {
                System.out.println("Status : Lulus");
            }else {
                System.out.println("Status : Tidak Lulus");
            }
        }else {
            System.out.println("Predikat Nilai : E");
            if(nilai >= 60) {
                System.out.println("Status : Lulus");
            }else {
                System.out.println("Status : Tidak Lulus");
            }
        }

        in.close();
    }
}
