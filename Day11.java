//mengimpor class scanner agar program dapat menerima input dari keyboard
import java.util.Scanner;

//membuat class
public class day011 {

    //method pertama yang di jalankan oleh program
    public static void main(String[] args) {

        //membuat objek untuk membaca input dari keyboard
        Scanner input = new Scanner (System.in);

        //menampilkan judul
        System.out.println("PROGRAM INPUT DATA");

        //meminta pengguna memasukkan nama
        System.out.println("Masukkan nama   : ");

        //membaca input berupa texs dan menyimpan ke variabel nama
        String nama = input.nextLine();

        //meminta pengguna memasukkan umur
        System.out.println("Masukkan umur   : ");

        //membaca input berupa angka dan menyimpan ke variabel umur
        int umur = input.nextInt();

        //menampilkan kembali nama yang telah dimasukkan
        System.out.println("Nama    : " + nama);

        //menampilkan kembali umur yang telah di masukkan
        System.out.println("Umur    : " + umur);

        //menutup scenner
        input.close();
    }
}
