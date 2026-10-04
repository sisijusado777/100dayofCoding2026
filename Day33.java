import java.util.Scanner;

public class day033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai suhu : ");
        double suhu = in.nextDouble();

        if (suhu > 30) {
            System.out.println("Panas");            
        }else{
            System.out.println("Tidak panas");
        }
        in.close();
    }    
}
