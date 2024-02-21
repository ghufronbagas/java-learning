import java.util.*;

public class IfElse1 {   // 21
    public static void main(String[] args){

        Scanner input;
        input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Masukkan nilai a = ");
        a = input.nextInt();
        System.out.print("Masukkan nilai b = ");
        b = input.nextInt();
        System.out.print("Masukkan nilai c = ");
        c = input.nextInt();

        if (a > b && a > c) {
            System.out.println("nilai a adalah yang terbesar");
        } else if (b > a && b > c) {
            System.out.println("nilai b adalah yang terbesar");
        } else if (c > a && c > b){
            System.out.println("nilai c adalah yang terbesar");
        } else {
            System.out.println("terdapat kesalahan pada bilangan yang anda masukkan");
        }
    input.close();

    }
}