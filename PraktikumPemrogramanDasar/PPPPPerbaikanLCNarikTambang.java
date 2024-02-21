import java.util.*;


public class PPPPPerbaikanLCNarikTambang{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int terpilih = in.nextInt();
        int[] peserta = new int[length];

        
        int[] dipilih =new int[terpilih];
        int[]indexing = new int[length];


        for(int i=0; i < peserta.length; i++){
            indexing[ i] = i + 1;
            peserta[i] = in.nextInt();
        }



        for(int i =0; i < peserta.length-1; i++){
            for(int j = 0; j < peserta.length-1; j++) {
                if(peserta[j] < peserta[j+1] ){

                    int cache= indexing[j];
                    indexing[j] = indexing[j+ 1];
                    indexing[j+1] = cache;

                    int cache2 = peserta[j];
                    peserta[j] =peserta[j+1 ];
                    peserta[j+1] = cache2;

                }
            }
        }

        for(int i = 0; i < dipilih.length; i++ ){
            System.out.print(indexing[i] + " ");
        }
        

    }
}
/*
7
4
46 92 54 76 80 47 50
*/