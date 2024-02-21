import java.util.*;

public class CCArrayMultiDimensi {
    public static void main(String[] args) {

        System.out.println("\n Multi Dimensi Array \n");
        // array 1 dimensi
        int[] array1 = {1,2,3,4,5};

        // membuat array 2 dimensi
        int[][] array2 = {
            {1,2},
            {5,6},
        };
        printArray2D(array2, "array2");

        // cara membuat array 2 dimensi dengan deklarasi

        //int [baris] [kolom]
        int[][] array3 = new int[5] [4];
        printArray2D(array3, "array3");
        System.out.println(array3.length);
        // cara looping di array multidimensi
        printArray2Dloop(array3);

        //looping lengkap secara manual
        for(int i = 0; i<array3.length; i++){
            System.out.print("[");
            for(int j = 0; j<array3[i].length; j++){
                System.out.print(array3[i][j] + ", ");
            }
            System.out.print("]\n");
        }

        //looping dengan for each
        for (int[] baris : array3) {
            System.out.print("[");
            for(int angka : baris){
                System.out.print(angka + ", ");
            }
            System.out.print("]\n");
        }

        int[][][] array3D = new int[2][3][5];

        for(int[][] a : array3D){
            for(int[] b : a){
                for(int c : b){
                    System.out.println(c);
                }
            }
        }
        System.out.println(Arrays.deepToString(array3D));

        //array secara manual untuk pembuktian
        System.out.println("\n pembuktian");
        int[][]array2D = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
        };
        printArray2D(array2D, "array2D");

        // satu hal yang bikin array multi dimensi aneh
        int[][] arrayAneh = {
            {1,2,3},
            {4,5,6,7},
            {8}
        };
        printArray2Dloop(arrayAneh);

        
    }
    private static void printArray2D(int[][] a, String nama){
        System.out.println(nama + " = " + Arrays.deepToString(a));
    }
    private static void printArray2Dloop(int[][] a){
        for (int[] baris : a) {
            System.out.print("[");
            for(int angka : baris){
                System.out.print(angka + ", ");
            }
            System.out.print("]\n");
        }
    }
}