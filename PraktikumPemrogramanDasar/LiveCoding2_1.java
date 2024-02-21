import java.util.*;

public class LiveCoding2_1{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    int total = 0;

    if(a<=b && a<=c){
        if(b<=c){
            total = a+b;
        }else if(c<=b){
            total = a+c;
        }
    } else if(b<=a && b<=c){
        if(a<=c){
            total = a+b;
        }else if(c<=a){
            total = b+c;
        }
    } else if(c<=a && c<=b){
        if(b<=a){
            total = b+c;
        }else if(a<=b){
            total = c+a;
        }
    }

    System.out.println(total);
        
    in.close();

    }
}