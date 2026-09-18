import java.util.Scanner;

public class day017 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Operator Penugasan");

        System.out.print("Masukkan Nilai Awal     : ");
        int angka = input.nextInt();
        System.out.println("Nilai awal              : " + angka);
        
        angka += 5;
        System.out.println("setelah +=5             : " + angka);
        
        angka -= 3;
        System.out.println("Setelah -=3             : " + angka);
        
        angka *= 2;
        System.out.println("Setelah *= 2            : " + angka);
        
        angka /= 2;
        System.out.println("Setelah /= 2            : " + angka);
        
        angka %= 3;
        System.out.println("Setelah %= 3            : " + angka);

        input.close();

    }
}
