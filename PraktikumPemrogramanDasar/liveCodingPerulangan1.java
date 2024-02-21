import java.util.*;

public class liveCodingPerulangan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int looping = 0;
        int dengklek = 0;
        int bejo = 0;
        int bahagia = 0;

        looping = in.nextInt();

        for (int i = 0; i < looping; i++) {
            dengklek = in.nextInt();
            bejo = in.nextInt();

            int a = dengklek*2;
            int b = bejo*2;
            
            if(a<=bejo && b<=dengklek){
                bahagia = bahagia + 1;
            }

        }


        System.out.println(bahagia);


    }

    
}
