import java.util.*;

public class ternaryOperator4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // ternary operator
        // variable x = ekspresi ? statement_true : statement_false

        int a, x;

        System.out.print("Masukkan nilai : ");
        a = input.nextInt();

        // variable x = ekspresi ? statement_true : statement_false;

        x = (a == 10) ? (a/a) : (a*2);

        // if(a == 10){
        //    x =  a / a;
        // } else {
        //     x = a*2;
        // }

        System.out.println(x);

        input.close(); 

    }
    
}
