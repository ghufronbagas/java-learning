import java.util.*;
import javax.swing.*;

public class zaArray {
    public static void main(String[] args) {
        // int[] a = {1,3,5,7,0,-1};

        // bubbbleSort(a);
        // printArray(a);

        // int [][] multidimensionalArray = {{1,2,3,1},{4},{5,6}};
        // int length = multidimensionalArray.length;
        // System.out.println(length);
        // for (int i = 0; i < multidimensionalArray.length; i++) {
        //     for (int j = 0; j < multidimensionalArray[i].length; j++) {
        //         System.out.print(multidimensionalArray[i][j] + "\t");
        //     }
        //     System.out.println("");
        // }
        // for(int a[] : multidimensionalArray){
        //     for(int b : a){
        //         System.out.print(b + "\t");
        //     }
        //     System.out.println("");
        // }




    }

    //bubble sort
    public static int[] bubbbleSort(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
        
    }
    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }




    
}
