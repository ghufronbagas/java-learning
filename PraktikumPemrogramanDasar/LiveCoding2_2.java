import java.util.*;

public class LiveCoding2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int pemenangAwal = a;

        if(b > pemenangAwal){
            pemenangAwal = b;
        }else if(b == pemenangAwal){
            pemenangAwal = a;
        }
        
        if(pemenangAwal == a){
            b = b+c;
        }else if(pemenangAwal == b){
            a = a+c;
        }
        
        
        int pemenangSementara = a;

        if(b > pemenangSementara){
            pemenangSementara = b;
        }else if(b == pemenangSementara){
            pemenangSementara = a;
        }
        
        if(pemenangSementara == a){
            if(b % 2 != 0){
                b = b+d;
            }else if(b % 2 == 0 && a % 2 == 0){
                b = b+d;
            }else if(b % 2 == 0 && a % 2 != 0){
                a = a+d;
            }else a = a+d;
        }else if(pemenangSementara == b){
            if(a % 2 != 0){
                a = a+d;
            }else if(a % 2 == 0 && b % 2 == 0){
                a = a+d;
            }else if(a % 2 == 0 && b % 2 != 0){
                b = b+d;
            }
        }

        if(a > b){
            System.out.println("Jono");
        }else if(b > a){
            System.out.println("Jontor");
        }else if(b == a){
            System.out.println("Jono");
        }


    in.close();
    }
    
}
