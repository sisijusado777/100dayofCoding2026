import java.util.Scanner;

public class java022 {

        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            System.out.println("Program menukar nilai dua variabel");

            System.out.print("Masukkan nilai angka1 : ");
            int angka1 = input.nextInt();

            System.out.print("Masukkan nilai angka2 : ");
            int angka2 = input.nextInt();
            
            System.out.println("\nSebelum ditukar   : ");

            System.out.println("Angka1      : " + angka1);
            System.out.println("Angka2      : " + angka2);

            int temp = angka1;
            angka1 = angka2;
            angka2 = temp;

            System.out.println("\nSetelah di tukar  : ");
            System.out.println("Angka1      : " + angka1);
            System.out.println("Angka2      : " + angka2);

            input.close();

    }
}
