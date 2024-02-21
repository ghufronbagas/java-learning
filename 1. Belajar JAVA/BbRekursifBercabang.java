import java.util.*;
import java.lang.String;

public class BbRekursifBercabang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan nilai : ");
        int nilai = in.nextInt();
        int nilaiFibbonaci = fibbonaci(nilai, "atas");
        System.out.println("nilai fibbonaci ke "+ nilai +" adalah " + nilaiFibbonaci);

        in.close();

    }
    private static int fibbonaci(int n, String daun){   //rekursif bercabang, dengan looping hingga 100 maka akan membuat kinerja tidak efisien
        System.out.println("daun " + daun);
        System.out.println("fibbonaci ke - " + n);
        if(n==1 || n == 0){
            return n;
        }else{
            return fibbonaci(n-1, "kiri") + fibbonaci(n-2,"kanan");
        }
    }

}
