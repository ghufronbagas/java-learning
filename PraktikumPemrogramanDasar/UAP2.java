import java.util.*;

public class UAP2 {

    public static void main(String[] argx) {
        Scanner input = new Scanner(System.in);

        String koordinatA = input.nextLine();
        String koordinatB = input.nextLine();
        String koordinatC = input.nextLine();   

        int[] a = koordinat(koordinatA.split(" "));
        int[] b = koordinat(koordinatB.split(" "));
        int[] c = koordinat(koordinatC.split(" "));

        int jarakX = Math.abs(b[0] - a[0]);
        int jarakY = Math.abs(b[1] - a[1]);

        boolean kotakA = didalamkotak(a, jarakX, jarakY, c);
        boolean kotakB = didalamkotak(b, jarakX, jarakY, c);

        if(kotakA && kotakB){
            System.out.println("Bahaya");
        } else if(kotakA || kotakB){
            System.out.println("Hati-hati");
        } else {
            System.out.println("Aman");
        }
    }

    static int[] koordinat(String[] koordinatStr){
        int[] coordinate = new int[2];
        for(int i = 0 ; i < koordinatStr.length ; i++){
            coordinate[i] = Integer.parseInt(koordinatStr[i]);
        }
        return coordinate;
    }

    static boolean didalamkotak(int[] tengah, int jarakX, int jarakY, int[] jarak){
        int xMin = tengah[0] - jarakX;
        int yMin = tengah[1] - jarakY;

        int xMax = tengah[0] + jarakX;
        int yMax = tengah[0] + jarakY;

        return ((xMin <= jarak[0]) && (jarak[0] <= xMax)) && ((yMin <= jarak[1]) && (jarak[1] <= yMax));
    }
}\


/*
5
3
5
10
2
100
 */