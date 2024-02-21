import java.util.Scanner;

public class lcDua {

    private static int shotsKasus(int n, int k, int[] heights) {
    
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++){

                if (heights[j] > heights[j + 1]){
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }
    
        int shots = 0;
    
    
        for (int i = 0; i < n; i++){
            if (heights[i] > k) {
                shots = n - i; 
                break;
            }
        }
    
        return shots;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int kasus = in.nextInt();

        for (int t = 0; t < kasus; t++){
            int n = in.nextInt();
            int k = in.nextInt();

            int[] heights = new int[n];
            for (int i = 0; i < n; i++){
                heights[i] = in.nextInt();
            }

            System.out.println(shotsKasus(n, k, heights));
        }
    }




}
