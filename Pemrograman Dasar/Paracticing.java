import java.util.Scanner;

public class Paracticing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan a ");
        int a = input.nextInt();

        System.out.println("Masukkan b ");
        int b = input.nextInt();

        System.out.println("Masukkan c ");
        int c = input.nextInt();

        
        if (a > b && a > c) {
            System.out.println("a terbesar ");
        } else {
            if (b > c) {
                System.out.println("b terbesar");
            } else {
                System.out.println("c terbesar ");
            }
        }

 input.close();
        

    }
}