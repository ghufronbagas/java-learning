import java.util.*;

public class nestedIfElse2 { // 22
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("masukkan nilai a = ");
        a = input.nextInt();
        System.out.print("masukkan nilai b = ");
        b = input.nextInt();

        if (a == 5){
            System.out.println("input a adalah sesuai");
            if (b == 10){
                System.out.println("input b juga sesuai");
            } 
        } else if (b == 10){
            System.out.println("hanya input b yang sesuai");
        } else {System.out.println("kedua input tidak sesuai");
    }
            
        input.close();




    }
    
}
