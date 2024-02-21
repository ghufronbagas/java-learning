public class BbPengenalanMethod {
    public static void main(String[] args) {
        
        int y,x;
        x = 10;
        y = (x+2)*x;
        System.out.println("x = " + x + ", y = " + y);

        x = 20;
        y = (x+2)*x;
        System.out.println("x = " + x + ", y = " + y);

        x = 30;
        y = (x+2)*x;
        System.out.println("x = " + x + ", y = " + y);

        System.out.println("====================");

        // maka dapat disederhanakan menjadi dengan menggunakan contoh method baru

        System.out.println("MENGHITUNG FUNGSI");
        x = 10;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 20;
        y = hitung(x);
        System.out.println("x = "+ x + ", y = "+ y);

        x = 24;
        y = hitung(x);
        System.out.println("x = "+ x + ", y = "+ y);

        System.out.println("KUADRATT");
        x = 2;
        y = kuadratkan(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 100;
        y = kuadratkan(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 5;
        y = kuadratkan(x);
        System.out.println("x = " + x + ", y = " + y);


    }
    static int hitung(int input){
        int hasil = (input + 2) * input;
        return hasil;
    }
    private static int kuadratkan(int input){
        int hasil = input * input;
        return hasil;
    }

}