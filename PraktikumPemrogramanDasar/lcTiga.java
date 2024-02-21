import java.util.Scanner;

public class lcTiga {

    private static int eqPoint(int y, int[] z, int[] r) {
        int points = 0;

        for (int i = 0; i < y; i++) {
            if (z[i] == r[i]) {
                points++;
            }
        }
        return points;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        for (int t = 0; t < x; t++) {
            int y = in.nextInt();

            int[] z = new int[y];
            for (int i = 0; i < y; i++) {
                z[i] = in.nextInt();
            }

            int[] r = new int[y];
            for (int i = 0; i < y; i++) {
                r[i] = in.nextInt();
            }

            int points = eqPoint(y, z, r);
            System.out.println(points);
        }

        in.close();
    }

}
