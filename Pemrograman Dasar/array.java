import java.util.*;

public class array {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    // tipe data primitif bersifat homgen, array bersifat homogen
    // tapi saat smstr 2 array dapat bersifat heterogen
    
    // array / larik(sesuai kbbi)

    //array satu dimensi
    int a[] = new int[5];
    a[0] = 1;
    a[4] = 4;
    for (int i = 0; i < a.length; i++) {
       System.out.print(a[i] + " "); 
    }

    a = new int[] {1,2,3,4,5}; // int[] a = {1,2,3,4,5}
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println(" ");

    int[] x = {1,2,3};
    int[] y = {3,4,5};
    int[] z = {x.length};
    for (int i = 0; i < x.length; i++) {
        z[i] = x[i] + y[i];
        System.out.println(z[i] + " ");
    }

    // String b[] = new String[5];
    // b[0] = "kamu";
    // b[2] = "cantik";
    // for (int i = 0; i < b.length; i++) {
    //     System.out.println(b[i] + " ");
    // }
    // System.out.println(b[0]);


    //array multi dimensi

    
    }
}