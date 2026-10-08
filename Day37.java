import java.util.Scanner;

public class day037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double bilangan = in.nextDouble();
        System.out.println("Bilangan : " + bilangan);

        if(bilangan > 0) {
            System.out.println("Status : Bilangan positif");
        }else if (bilangan < 0) {
            System.out.println("Status : Bilangan negatif");
        }else{
            System.out.println("Status : Bilangan Nol");
        }
        in.close();
    }
}
