public class method {

    // fungsi untuk mencari nilai max
    private static int nilaiMax(int a, int b){
        int max = 0;
        if(a > b){
            max = a;
        }else{
            max = b;
        }
        return max;
    }
    //fungsi untuk mencari faktorial
    private static long faktorial(long a){
        long f = 1;
        for(long i = 1; i<a; i++)
            f *= i;

        return f;
    }

    private static String getNamaHari(int day){
        String sday = "";
        switch (day){
            case 7: sday = "Minggu"; break;
            case 1: sday = "Senin"; break;
            case 2: sday = "Selasa"; break;
            case 3: sday = "Rabu"; break;
            case 4: sday = "Kamis"; break;
            case 5: sday = "Jumat"; break;
            case 6: sday = "Sabtu"; break;
            default: sday = "input yang anda masukkan salah";
        }
        return sday;

    }
    public static void main(String[] args) {
        
        int a = 10;
        int b = 15;
        int max = Integer.MIN_VALUE;

        if(a > b){
            max = a;
        }else{
            max = b;
        }

        System.out.println("nilai maksimum = " + max);

        int c = 10;
        int d = 15;
        int max2 = Integer.MIN_VALUE;

        if(c > d){
            max2 = c;
        }else{
            max2 = d;
        }

        System.out.println("nilai maksimum = " + max2);


        int z = nilaiMax(10, 15);
        System.out.println("nilai maks = " + z);

        long g = faktorial(10);
        System.out.println(g);






    }
    
}
