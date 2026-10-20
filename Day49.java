import java.util.Scanner;

public class day049 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa : ");
        int nilai = in.nextInt();

        String status = (nilai >= 75) ? "Lulus" : "Tidak Lulus";

        System.out.println("Nilai : "+ nilai);
        System.out.println(" Status : "+ status);
    in.close();
    }    
}
