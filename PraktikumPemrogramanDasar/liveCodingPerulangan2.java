import java.util.*;

public class liveCodingPerulangan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int looping = in.nextInt();
        int battery;
        int i = 0;
        
        while(i < looping) {
            i++;
            int time = 0;
            battery = in.nextInt();
            
            while(battery != 50) {
                if(battery < 50){
                    battery = battery +2;
                }else{
                    battery = battery -3;
                }
                time++;
            } 
            System.out.println(time);
        }

    }
}

