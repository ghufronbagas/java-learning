import java.util.*;

public class CCLebihDalamArrayMultiDimensi {
    public static void main(String[] args) {

        int[][] a = {
            {1,2,3},
            {4,5,6},
        };
        System.out.println(a);
        System.out.println(Arrays.deepToString(a));
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println("================");

        System.out.println("");
        char[] b = {'a','b','c'};
        char[] c = {'d','e'};

        char[][] d = {
            b,
            c
        };
        System.out.println(d);
        System.out.println(Integer.toHexString(System.identityHashCode(b)));
        System.out.println(Integer.toHexString(System.identityHashCode(c)));
        System.out.println(Arrays.toString(d));
    }
    
}
