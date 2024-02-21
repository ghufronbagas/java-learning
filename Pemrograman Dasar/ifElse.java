import java.util.*;

class ifElse {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("masukkan bilangan a : ");
        a = input.nextInt();

        System.out.print("masukkan bilangan b : ");
        b = input.nextInt();

        System.out.print("masukkan bilangan c : ");
        c = input.nextInt();

        if (a > b && a > c) {
            System.out.println(" A terbesar");
        } else {
            if (b > a && b > c) {
                System.out.println("b terbesar");
            } else {
                if (c > a && c > b) {
                    System.out.println("c terbesar");
                }
            }
        }


        
    }
}
