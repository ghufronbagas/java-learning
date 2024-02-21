import java.util.Arrays;

public class aaaBubbleSort {
    public static void main(String[] args) {
        
        int[] array = {5, 6, 7, -1, 4, 0, -5, 9};

        printArray(array);
        bubbleSort(array);
        printArray(array);

        int[] array2 = {-7, -4, 1, 2, 0, -6, 10, 12, 4};
        printArray(array2);
        int[] sortedArray = bubbleSort2(array2);
        printArray(array2);
        printArray(sortedArray);
        
    }
    
    //inplace
    public static void bubbleSort(int[] array){
        for(int i = 1; i<array.length; i++){
            for(int j = 0; j<array.length - 1; j++){

                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array [j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
    //not inplace
    public static int[] bubbleSort2(int[] a){
        // for(int i = 1; i<a.length; i++){
        //     for(int j = 0; j<a.length - 1; j++){
        //         if(a[j] > a[j+1]){
        //             int tmp = a[j];
        //             a[j] = a[j+1];
        //             a[j+1] = tmp;
        //         }
        //     }
        // }
        int[] sorted = new int[a.length];
        System.arraycopy(a, 0, sorted, 0, a.length);
        bubbleSort(sorted);
        return sorted;
    }
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
    
}
