import java.util.*;

public class TugasMethod2 {

    // cek bilangan
    public static void cekPrima(int a){
        int cache = 0;
        int loop = 1;
        while(loop<=a){
            if(a%loop==0)
                cache++;
            loop++;
        }
        if(cache==2){
            System.out.println(a + " adalah bilangan prima");
            return;
        }else{
            System.out.println(a + " bukan bilangan prima");
            return;
        }
    }

    // print bilangan prima 1 - 100
    public static void printPrima(){
        int a = 1;
        int loop = 1;
        while (loop<100){
            a++;
            int count = 0;
            int loop2 = 1;
            while (loop2<=a) {
                if(a%loop2==0)
                    count++;
                loop2++;
            }
            if(count==2)
                System.out.print(a + " ");
            loop++;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan yang akan di cek : ");
        int a = in.nextInt();
        cekPrima(a);
        printPrima();
    }
    
}
