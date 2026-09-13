/*soal01
public class soal01 {
    public static void main(String[] args) {

        //berikut biodata diri saya

        System.out.println("Nama\t\t: Sisi Jusado\nNIM\t\t: D0224039\nKelas\t\t: D\nMahasiswa\t: True");
    }
    
}
*/
/*soal02
public class soal02 {
    public static void main(String[] args) {

        //berikut jawaban soal 2
        double a = 2.5666;
        
        double b = 3.14455;

        System.out.printf("%.2f%n", a);
        System.out.printf("%.2f", b);
    }
}

*/
/*soal03
public class soal03 {
    
    public static void main(String[] args) {

        //nama awal
        String nama = "Sisi Jusado";

        //umur awal
        int Umur = 19;

        //hasil
        System.out.println("Sesudah :");
        System.out.println("Nama Awal       : " + nama);
        System.out.println("Umur Awal       : " + Umur);

        //update umur dan nama
        nama = "sisi jusa";
        Umur = 20;

        //hasil update
        System.out.println("Sesudah :");
        System.out.println("Nama Baru       : " + nama);
        System.out.println("Umur Baru       : " + Umur);
    }
}

*/
/* soal04
import java.util.Scanner;
public class soal04 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input Biodata Mahasiswa");

        System.out.print("Masukkan Nama   : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM    : ");
        String Nim = input.nextLine();

        System.out.print("Masukkan tinggi badan(cm)   : ");
        float tinggiBadan = input.nextFloat();

        System.out.print("Masukkan berat badan    : ");
        float beratBadan = input.nextFloat();

        System.out.print("Masukkan status mahasiswa   :");
        boolean statusMahasiswa = input.nextBoolean();
        

        System.out.println("========================================");
        System.out.println("Nama                    : " + nama);
        System.out.println("NIM                     : " + Nim);
        System.out.println("Tinggi Badan            : " + tinggiBadan);
        System.out.println("Berat Badan             : " + beratBadan);
        System.out.println("Status Mahasiswa        : " + statusMahasiswa);
    }
}

*/
/*soal05
public class soal05 {

    public static void main(String[] args) {

        //memasukkan tipe data texs
        String nama = "Sisi jusado";

        //tipe data bilangan bulat
        byte umur = 19;

        short tahunLahir = 2007;

        int nim = 224039;

        long jumlahPenduduk = 2760000000L;

        //tipe data nilai pecahan
        float tinggiBadan = 160.77f;
        
        double beratBadan = 55.77;

        //tipe data karakter
        char nilai = 'A';

        //tipe data benar / salah
        boolean lulus = true;

        //tampilkan hasil
        System.out.println("Hasil Setiap Hasil Tipe Data :");

        //hasil tipe data bilangan bulat
        System.out.println("Nama                : " + nama);
        System.out.println("Umur                : " + umur);
        System.out.println("Tahun Lahir         : " + tahunLahir);
        System.out.println("NIM                 : " + nim);
        System.out.println("Jumlah penduduk     : " + jumlahPenduduk);
        System.out.println("Tinggi Badan        : " + tinggiBadan);
        System.out.println("Berat Badan         : " + beratBadan);
        System.out.println("Nilai               : " + nilai);
        System.out.println("Lulus               : "+ lulus);
    }
}

*/
