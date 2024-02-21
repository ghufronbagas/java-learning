import java.util.*;

public class liveArray2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int[] array = new int[30];

        String g = in.next();

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(g.charAt(i)));
        }

        int a = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]==1){
                a++;
            }
        }

        int gajiPokok = x * a;

        int streak = 0;
        int longest = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == array[i+1] && array[i] == 1){
                streak++; 
            }else if(array[i]==0){
                if(longest < streak){
                    longest = streak;
                }
                streak = 0;
            }
            
        }
        int gajiTambahan = y * longest;

        int gaji = gajiPokok + gajiTambahan;

        System.out.println(gaji);



        //111100110101100000101100011111


    }
}
