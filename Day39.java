import java.util.Scanner;

public class day039 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        double angka1 = in.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /) : ");
        char operator = in.next().charAt(0);

        System.out.print("Masukkan angka kedua : ");
        double angka2 = in.nextDouble();

        if (operator == '+') {
            System.out.println("Hasil : "+ (angka1 + angka2));
        }else if (operator == '-') {
            System.out.println("Hasil : "+ (angka1 - angka2));
        }else if (operator == '*') {
            System.out.println("Hasil : "+ angka1 * angka2);
        }else if (operator =='/') {
            if(angka2 != 0) {
                System.out.println("Hasil : "+ angka1 / angka2);
            }else {
                System.out.println("Eror: Tidak bisa dibagi dengan nol!!");
            }
        }else {
            System.out.println("Operator tidak tersedia!");
        }
        in.close();
    }    
}
