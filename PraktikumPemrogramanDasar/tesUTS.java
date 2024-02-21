// enum day{
//     MINGGU,
//     SENIN,
//     SELASA, 
//     RABU,
//     KAMIS,
//     JUMAT,
//     SABTU
// }

// import java.lang.Math;
import java.text.NumberFormat;
import java.util.Locale;

public class tesUTS {
    public static void main(String[]args){

        double a = 100000000;
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        String z = rupiah.format(a);
        System.out.println(z);
        
        // NumberFormat format = NumberFormat.getPercentInstance();
        // String z = format.format(a);


        // int a = 10, b = 20, c = 5;

        // int a, b;
        // a = 90;
        // b = 17;

        // int c = 3 % 5 + 5 % 5;
        // System.out.println(c);

        // int a = 987;

        // System.out.printf("%#010o", a);

        // float z = 7654.123456789F ;
        // double d = 7654.1234567890123456789;
        // System.out.printf("%g %15g %15.3g", z,z,z);


        // a%=10;

        // System.out.println(a);
        
        // boolean f = (true);
        // System.out.println(!f);

        // int n = 7;

        // String jawaban = (n % 2 == 0) ? (n % 3 == 0 ? "2 dan 3" : "2") : (n % 3 == 0 ? "3" : "Gajelas");
        
        // System.out.println(jawaban);

        // double a = 9.12938;
        // double z = Math.PI;
        // System.out.println(z);

        // float c = 0.2F;
        // System.out.printf("%f", c);



        


        
    }
    
}
