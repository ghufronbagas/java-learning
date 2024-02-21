import java.util.*;

public class lcMethod1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] peserta = new int [a];
        int[] indexing = new int[a];
        for (int i = 0; i < indexing.length; i++) {
            indexing[i] = i+1;
        }

        int b = in.nextInt();
        // int[] dipilih = new int[b];

        for (int i = 0; i < peserta.length; i++) {
            peserta[i] = in.nextInt();
        }
        
        int x = 0;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < peserta.length; j++) {
                if(peserta[i]>x){
                    x = peserta[i];
                }
            }
            for (int j = 0; j < indexing.length; j++) {
                
            }
        }




    }
    
}
