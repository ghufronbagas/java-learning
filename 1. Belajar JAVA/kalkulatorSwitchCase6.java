import java.util.*;

public class kalkulatorSwitchCase6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float a , b, hasil;
        String operator;

        System.out.print("masukkan nilai pertama :");
        a = input.nextFloat();

        System.out.print("masukkan operator :");
        operator = input.next();

        System.out.print("masukkan nilai kedua :");
        b = input.nextFloat();

        switch(operator){
            case "+":
            System.out.println("operasi penjumlahan");
            hasil = a + b;
            System.out.printf("hasil dari %.0f %s %.0f = %.0f",a, operator, b, hasil);
                break;
            case "-":
            System.out.println("operasi pengurangan");
            hasil = a - b;
            System.out.printf("hasil dari %.0f %s %.0f = %.0f",a, operator, b, hasil);
                break;
            case "*":
            System.out.println("operasi perkalian");
            hasil = a * b;
            System.out.printf("hasil dari %.0f %s %.0f = %.0f", a, operator, b, hasil);
                break;
            case "/":
            System.out.println("operasi pembagian");
            hasil = a / b;
            if (b == 0){
                System.out.println("hasil dari pembagian anda tidak terdifinisi karena penyebut 0");
            } else 
            {System.out.printf("hasil dari %.0f %s %.0f = %.0f",a, operator, b, hasil);
                } break;

            default:
                System.out.printf("operator %s tidak ditemukan", operator);
            }







    }
    
}
