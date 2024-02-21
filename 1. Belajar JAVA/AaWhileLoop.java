import java.util.*;

public class AaWhileLoop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        // System.out.println("Awal program");

        int a = 0;
        // boolean kondisi = true;

        // while (kondisi){
        //     System.out.println("while loop :" + a);
        //     if(a == 10)
        //         kondisi = false;
        //     a++;
        // }
        // System.out.println("nilai a diakhir adalah :" + a);

        while(a<=10){
        System.out.println("While loop: "+ a);
        a++;
        }


        int x = 21;
        while(x>=10){
            x--;    
            System.out.println("While loop decreasing : "+ x);
        }



        in.close();



    }
    
}
