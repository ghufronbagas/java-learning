import java.util.Arrays;

public class CCArrayLebihDalam {
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5};
        int[] b = new int[5];
        System.out.println(a);
        System.out.println(b);
        b = a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[1] = 100;
        b[4] = 333;
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        ubahArray(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
    private static void ubahArray(int[] dataArray){
        dataArray[0] = 125;
        // for(int data : dataArray){
        //     System.out.println(data);
        // }

    }
}
