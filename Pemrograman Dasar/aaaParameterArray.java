import java.util.*;

public class aaaParameterArray {
    public static void main(String[] args) {
        int y = 5;
        int[] x = {1,2,3,4,5};

        printArray(x);
        //mengubah array
        ubahArray(x);
        printArray(x);
        //mengubah hanya elemen
        ubahElemen(x[2]); // karena yang diiskan adalah tipe data primitif, maka dalam array tidak berubah
        printArray(x);
        //mengubah array dengan overloading metod
        ubahElemen(x, 1, 99);
        printArray(x);
        
    }

    public static void ubahArray(int[] x){
        for(int i = 0; i<x.length; i++){
            x[i] *= 2;
        }
    }
// dua method dibawh memiliki nama yang sama = OVERLOADING METHOD
    public static void ubahElemen(int x){
        x *= 2;
    }
    //overloading method, nama boleh sama namun signature(param) beda
    public static void ubahElemen(int[] x, int index, int value){
        x[index] = value;
    }

    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
    
}
