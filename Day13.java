//mengimpor class Scanner untuk menerima input dari keyboard
import java.util.Scanner;

//membuat class
public class day013 {

    //method utama yang pertama kali di jalankan
    public static void main(String[] args) {

        //membuat object Scanner dengan nama input
        Scanner input = new Scanner(System.in);

        //judul program
        System.out.println("Biodata Diri");
        
        //meminta pengguna memaksukkan nama
        System.out.print("Masukkan Nama           : ");
        String nama = input.nextLine();

        //masukkan nim
        System.out.print("Masukkan NIM            : ");
        String nim = input.nextLine();

        //masukkan jurusan
        System.out.print("Masukkan Jurusan        : ");
        String jurusan = input.nextLine();

        //masukkan umur
        System.out.print("Masukkan Umur           : ");
        int Umur = input.nextInt();

        //menghapus sisa enter setelah pengguna selesai memasukkan umur
        input.nextLine();

        //masukkan alamat
        System.out.print("Masukkan Alamat         : ");
        String alamat = input.nextLine();


        //pembatas 
        System.out.println("-----------------------------------------------------------------------------");

        //hasil output Nama
        System.out.println("Nama        : " + nama);
      
        //hasil output NIM
        System.out.println("NIM         : " + nim);
        
        //hasil output jurusan
        System.out.println("Jurusan     : " + jurusan);
        
        //hasil output Umur
        System.out.println("Umur        : " + Umur);
        
        //hasil output Alamat
        System.out.println("Alamat      : " + alamat);
    }
}
