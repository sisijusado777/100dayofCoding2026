import java.util.Scanner;

public class day051 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input jumlah pelanggan : ");
        int jp = in.nextInt();

        if (jp <= 0) {
            System.out.println("Status : Antrean kosong");
        }else{
            for(int i = 1; i <= jp; i++) {
                System.out.println("Nomor antrean : "+ i);
            }
        }

        in.close();
    }
}
