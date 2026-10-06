import java.util.Scanner;

public class day035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double angka = in.nextDouble();

        System.out.println("Angka : "+ angka);

        if(angka >= 10 && angka <= 50) {
            System.out.println("Status : Dalam rentang");
        }else if (angka > 50){
            System.out.println("Status : Diatas rentang");
        }else {
            System.out.println("Status : Dibawah rentang");
        }
        in.close();
    }
}
