import java.util.*;

public class zaMethod {
    public static void main(String[] args) {
        // int[] array1 = {-1, 7, 9 ,10,-5,0,6};
        // int[] sorted = bubbbleSort(array1);
        // printArray(sorted);

        int faktorial1 = faktorial(4);
        System.out.println(faktorial1);

        boolean seratusEmpat = isKelipatanDua(104);
        System.out.println(seratusEmpat);

        boolean enamPuluhEmpat = isKelipatanDua(64);
        System.out.println(enamPuluhEmpat);


        
    }
    //faktorial
    private static int faktorial(int a){
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }

    private static boolean isKelipatanDua(int a){
        if (a<=0)
            return false;
            while(a > 1){
                if(a%2 == 1)
                    return false;
                a /= 2;
            }
        return true;
    }
    // public static int[] bubbbleSort(int[] array){ // diurutkan dari nilai terkecil
    //     int temp = 0;
    //     for(int i = 0; i<array.length; i++){
    //         for(int j = 0; j<array.length-1;j++){
    //             if(array[j] > array[j+1]){
    //                 temp = array[j];
    //                 array[j] = array[j+1];
    //                 array[j+1] = temp;
    //             }
    //         }
    //     }
    //     return array;
    // }
    // public static void printArray(int[]a){
    //     System.out.println(Arrays.toString(a));
    // }


}
