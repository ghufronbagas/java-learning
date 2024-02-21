import java.util.*;

public class liveArray1 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();

        int m = in.nextInt();
        int jumlahPeserta[] = new int[n];
            for(int i = 0; i < n; i++){
                jumlahPeserta[i] = in.nextInt();
        }

        int indexing[]= new int[n];
            for(int i = 0; i < n;i++){
                indexing[i] = i + 1;
        }


        for (int i = 0; i < m; i++) {
            int indexingMax = i;
            int max = -999999999;
                for (int j = i; j < n; j++) {
                if (jumlahPeserta[indexing[j]-1] > max || (jumlahPeserta[indexing[j]-1] == max && indexing[j] < indexing[indexingMax])) {
                    max = jumlahPeserta[indexing[j] - 1];
                    indexingMax = j;
                }
            }
            int x = indexing[i];
            indexing[i] = indexing[indexingMax];

            indexing[indexingMax] = x;

            System.out.print(indexing[i] + " ");




    }
  }
}