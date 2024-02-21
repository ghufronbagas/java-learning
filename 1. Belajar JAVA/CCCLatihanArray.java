import java.util.*;

public class CCCLatihanArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] angka = {1,5,5,23,6,7,8,0,53};
        printArray(angka, "angka");

        System.out.println("===========================");



        int[] a = {1,4,5,6,5};
        printArray(a, "a");
        int[] b = {9,0,8,5,1};
        printArray(b, "b");


        //penjumlahan dua buah array
        System.out.println("\n======= Penjumlahan =======");
        int[] hasilJumlah = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            hasilJumlah[i] = a[i] + b[i];
        }
        printArray(hasilJumlah, "hasilJumlah");


        //menggabungkan dua buah array
        System.out.println("\n======= Penggabungan =======");
        int[] hasilGabung = new int [a.length + b.length];
        for(int i = 0; i < a.length; i++){
            hasilGabung[i] = a[i]; 
        }
        printArray(hasilGabung, "hasilGabung");
        for(int i = 0; i < b.length; i++){
            hasilGabung[a.length + i] = b[i];
        }
        printArray(hasilGabung, "hasilGabung fix");


        //sorting
        // System.out.println("\n======= Sorting =======");
        // int[] hasilSort = new int[a.length];
        // for()

        // // for(int i = 0; i < a.length; i++){

        // //     for(int j = 0; j < a.length - 1 - i; j++){

        // //         if(a[j] > a[j+1]){
        // //             int sementara = a[j];
        // //             a[j+1] = sementara;
        // //         }
        // //         printArray(a, "a");
        // //     }
        // // }


        //reverse sorting
        System.out.println("\n======= Reverse Sorting =======");
        Arrays.sort(a);
        printArray(a, "a");
        int[] reverseSorting = new int[a.length];
        int varReverse = a.length - 1;
        for(int i = 0; i < a.length; i++){
            reverseSorting[i] = a[varReverse];
            varReverse--;
        }
        printArray(reverseSorting, "reverseSorting");

        //reverse sorting dengan cara lain
        Arrays.sort(b);
        printArray(b, "b");
        sorting2(b);
        printArray(b, "sorting 2");
        

    }
    //fungsi membuat sorting dengan cara lain
    private static void sorting2(int[] dataArray){
        Arrays.sort(dataArray);
        int reverse2;

        for(int i = 0; i < dataArray.length/2; i++){
            reverse2 = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = reverse2;
        }
    }


    //fungsi untuk print array dengan message diisi nama var
    private static void printArray(int a[], String message){
        System.out.println("array "+ message+ " = " + Arrays.toString(a));
    }


}
