import java.util.Scanner;

public class day034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();

        System.out.println("Nilai : "+ a);
        if(a >= 75) {
            System.out.println("Status : Lulus");
        }else if (a >= 60) {
            System.out.println("Status : Lulus bersyarat");
        }else {
            System.out.println("Status : Tidak Lulus");
        }

        in.close();
    }
}
