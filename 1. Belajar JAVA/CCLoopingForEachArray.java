import java.util.Arrays;

public class CCLoopingForEachArray {
    public static void main(String[] args){

        int[] angka = {11,12,13,14,15,16,17,18,19,20};
        System.out.println(Arrays.toString(angka));

        // looping standart
        for (int i = 0; i < 10; i++) {
            System.out.println("index ke-"+ i +" adalah "+ angka[i]);
        }

        //looping dengan properti dari array
        for (int i = 0; i < angka.length; i++) {
            System.out.println("looping properti ke-"+ i +" adalah "+ angka[i]);
        }

        //looping khusus array dengan for each(collection)
        for(int a : angka){
            System.out.println("looping for each-"+ a);
        }

    }
    
}
