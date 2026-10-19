import java.util.Scanner;

public class day048 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Angka pertama : ");
        double angka1 = in.nextInt();

        System.out.print("Operator : ");
        char operator = in.next().charAt(0);

        System.out.print("Angka kedua : ");
        double angka2 = in.nextInt();

        System.out.println("Kalkulator Sederhana");

        switch (operator) {
            case '+':
                System.out.println("Hasil dari"+ angka1 + "+" + angka2 + "adalah : "+(angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasil dari"+ angka1 + "-" + angka2 + "adalah : "+(angka1 - angka2));
                break;
            case '*':
                System.out.println("Hasil dari"+ angka1 + "*" + angka2 + "adalah : "+ angka1 * angka2 );
                break;    
            case '/' :
                if (angka2 != 0) {
                    System.out.println("Hasil dari"+ angka1 + "/" + angka2 + "adalah : "+ angka1 / angka2);
                }else {
                    System.out.println("Pembagian dengan nol tidak dapat dilakukan");
                }
                break;
            case '%' :
                if (angka2 != 0) {
                    System.out.println("Hasil dari"+ angka1 + "%" + angka2 + "adalah : "+ angka1 % angka2);
                }else {
                    System.out.println("Sisa bagi dengan nol tidak dapat dilakukan");
                }        
                break;
            default:
                System.out.println("Operator tidak valid");
                break;
        }

        in.close();
    }    
}
