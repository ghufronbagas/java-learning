import java.util.*;

public class TugasMethod1 {

    //hitung faktorial
    public static int faktorial(int a){
        int cache = 1;

        while (true) {
            if(a > 1){
                cache *= a;
                a--;
            }else if(a<=0){
                return 1;
            }else
                return cache;
        }
    }
    //hitung permutasi
    public static void permutasi(int n, int r){
        if(r>n){
            System.out.println("r tidak boleh lebih dari n \n\n");
            return;
        }
        int hasil = faktorial(n) / faktorial(n-r);       
        System.out.printf("         n!\n");
        System.out.printf("nPr = ------ = %d\n", hasil);
        System.out.printf("       (n-r)!\n");
        System.out.printf("Maka hasil permutasinya adalah : %d\n\n\n", hasil);
    }
    //hitung kombinasi
    public static void kombinasi(int n, int r){
        if(r>n){
            System.out.println("r tidak boleh lebih dari n \n\n");
            return;
        }
        int hasil = faktorial(n) / (faktorial(r) * faktorial(n-r));
        System.out.printf("           n!\n");
        System.out.printf("nCr = ----------- = %d\n", hasil);
        System.out.printf("       r! * (n-r)!\n");
        System.out.printf("Maka hasil kombinasinya adalah : %d\n\n\n", hasil);
    }

    //main program
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r;
        
        while (true) {
            System.out.println("""
                    Program Menghitung Permutasi dan Kombinasi
                    1. Menghitung PERMUTASI
                    2. Menghitung KOMBINASI
                    3. Keluar Program
                    """);
            System.out.print("Masukkan pilihan anda : ");
            int pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n\nPROGRAM UNTUK MENHITUNG PERMUTASI");
                    System.out.print("Masukkan nilai n : ");
                    n = in.nextInt();
                    System.out.print("Masukkan nilai r : ");
                    r = in.nextInt();

                    permutasi(n, r);
                    break;

                case 2:
                    System.out.println("\n\nPROGRAM UNTUK MENHITUNG KOMBINASI");
                    System.out.print("Masukkan nilai n : ");
                    n = in.nextInt();
                    System.out.print("Masukkan nilai r : ");
                    r = in.nextInt();

                    kombinasi(n, r);
                    break;

                case 3:
                    in.close();
                    return;

                default:
                    System.out.println("Input angka yang anda masukkan salah!");
                    break;
            }

            
        }



    }
    
}