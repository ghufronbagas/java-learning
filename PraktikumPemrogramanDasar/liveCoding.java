import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class liveCoding {

    public static void main(String[] args) {
        /*Semangat Gaiss :D*/
        
        Scanner input = new Scanner(System.in);
        
        // boolean input1 = input.nextBoolean();
        // boolean input2 = input.nextBoolean();
        
        // boolean output = input1 || input2;

        // System.out.println(output);
        
        double jumlah = input.nextDouble();
        
        double konversiKrat = jumlah / 3.3;
        double sisaTelur =  jumlah % 3.3;
            
        int konversiKratInt = (int) konversiKrat;
        
        
        System.out.printf("%s%2c %-9d %s\n", "jumlah krat", '=', konversiKratInt, "krat");
        System.out.printf("%s%3c %-9.1f %s\n", "sisa telur", '=',sisaTelur,"kg");

        System.out.printf("%c", ' ');
        


        
        
        
        
        
        
    }
}