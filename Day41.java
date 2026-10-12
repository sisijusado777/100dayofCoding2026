import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();

        if(a > 40.0) {
            System.out.println("Sangat panas");
        }else if(a > 35 && a <= 40){
            System.out.println("Gerah");
        }else if(a >25 && a <=35 ){
            System.out.println("Sejuk");
        }else if (a > 20 && a <=25) {
            System.out.println("Dingin");
        }else if (a > 15 && a <= 20) {
            System.out.println("Sangat dingin");
        }else{
            System.out.println("Tidak ada kondisi");
        }

        in.close();
    }
}
