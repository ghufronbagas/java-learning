import java.util.Arrays;

public class CCPengenalanArray {
    public static void main(String[] args) {
        
        //array adalah kumpulan data primitif

        System.out.println("==== array assignment ====");
        // tipe data[] var = {komponen}
        int[] a = {1,2,3,4};
        System.out.println(a); // print untuk mengetahui penyimpanan array
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        // deklarasi array
        // tipeData[] variable = new tipeData[jumlah]
        System.out.println("==== deklarasi array ====");
        double[] b = new double[5];
        b[3] = 11;
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        //libarry arrays
        //mencetak himpunan array a 
        System.out.println(Arrays.toString(a));
        //mencetak himpunan array b
        System.out.println(Arrays.toString(b));

    }
    
}
