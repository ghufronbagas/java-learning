import java.util.*;

public class kalkulatorIfElse5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float input1, input2, hasil;
        char operator;

        // format : input1 operator input2 = hasil

        System.out.print("Masukkkan angka pertama : ");
        input1 = input.nextFloat();

        System.out.println("Operator yang tersedia adalah +, -, *, /");
        System.out.print("Masukkan operator yang dibutuhkan : ");
        operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua : ");
        input2 = input.nextFloat();

        System.out.println("input user " + input1 + " " + operator + " " + input2);

        if (operator == '+'){
        //  PENJUMLAHAN
            hasil = input1 + input2;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
        //  PENGURANGAN
            hasil = input1 - input2;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
        //  PERKALIAN
            hasil = input1 * input2;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/'){
        //  PEMBAGIAN
                if (input2 == 0){
                    System.out.println("hasil tak dapat di definisikan");
                } else {
                    hasil = input1 / input2;
                    System.out.println("hasil = " + hasil);
                }
        } else {System.out.println("Operator tidak dapat ditemukan");}

    



    }
    
}
