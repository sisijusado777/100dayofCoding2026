import java.util.Scanner;

public class day036 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bilangan = in.nextInt();

        System.out.println("Bilangan : "+ bilangan);

        if(bilangan % 2 == 0) {
            System.out.println("Status : Bilangan genap");
        }else {
            System.out.println("Status : Bilangan ganjil");
        }
        in.close();
    }
}
