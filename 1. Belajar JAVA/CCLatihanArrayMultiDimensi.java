import java.util.*;

public class CCLatihanArrayMultiDimensi {
    public static void main(String[] args) {

        int[][] matrixA = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        printArray(matrixA);

        int[][] matrixB = {
            {11,12,13},
            {14,15,16},
            {17,18,19}
        };
        printArray(matrixB);

        System.out.println("penjumlahan");
        int[][] hasilTambah = penjumlahan(matrixA, matrixB);
        printArray(hasilTambah);




        //perkalian matriks
        int[][] matrixC = {
            {1,2},
            {3,4}
        };
        printArray(matrixC);

        int[][] matrixD = {
            {11,12},
            {13,14}
        };
        printArray(matrixD);
        System.out.println("perkalian");
        int[][]hasilKali = perkalian(matrixC, matrixD);
        printArray(hasilKali);
        








        
    }//FUNGSI PENGEMBALIAN PENJUMLAHAN
    private static int[][] penjumlahan(int[][] a, int[][] b){
        int barisA = a.length;
        int kolomA = a.length;
        int barisB = b.length;
        int kolomB = b.length;

        int[][] hasilTambah = new int[barisA][kolomA];

        if(barisA==barisB && kolomA==kolomB){
            for(int i = 0; i < barisA; i++){
                for(int j = 0; j < kolomA; j++){
                    hasilTambah[i][j] = a[i][j] + b[i][j];
                }
            }
        }else{
            System.out.println("jumlah baris atau kolom tidak sama");
        }
        return hasilTambah;


    }//FUNGSI UNTUK PERKALIAN ARRAY
    private static int[][] perkalian(int[][] matrixC, int[][] matrixD){
        int barisC = matrixC.length;
        int kolomC = matrixC.length;
        int barisD = matrixD.length;
        int kolomD = matrixD.length;
        //jika a * b maka jumlah baris akan mengikuti matriks a, dan kolom akan mengikuti dari kolom b
        int[][] hasilKali = new int[barisC][kolomD];

        int buffer;
        for(int i = 0; i < barisC; i++){
            for(int j = 0; j < kolomD; j++){
                buffer = 0;
                for(int k = 0; k < kolomC; k++){
                    buffer += matrixC[i][k] * matrixD[k][j];
                }
                hasilKali[i][j] = buffer;
            }
        }
        return hasilKali;

        
    }//FUNGSI PRINT ARRAY
    private static void printArray(int[][] a){
        int baris = a.length;
        int kolom = a[0].length;

        for (int i = 0; i < baris; i++){
            System.out.print("[");
            for(int j = 0; j < kolom; j++){
                System.out.print(a[i][j]);
                if(j < (kolom - 1)){
                    System.out.print(",");
                } else{
                    System.out.print("]");
                }
            }
            System.out.println("");
            
        }
        System.out.println("");


    }
    
}
