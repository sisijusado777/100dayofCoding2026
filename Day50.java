import java.util.Scanner;

public class day050 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nomor tiket : ");
        int nt =in.nextInt();

        String loket = (nt <= 0)  
            ? "Tiket tidak valid"
            : (nt % 2 == 0)
                ? "Loket A" : "Loket B";
        
        System.out.println("Silahkan menuju ke : "+ loket);
        
        in.close();
    }
}
