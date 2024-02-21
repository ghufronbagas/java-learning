public class BbFungsiOverload {
    public static void main(String[] args) {

        int hasilInt;
        hasilInt = tambah(4, 5);
        printAngka(hasilInt);

        double hasilDouble;
        hasilDouble = tambah(4.5d, 4);
        printAngka(hasilDouble);

        hasilDouble = tambah(10, 10.5);
        printAngka(hasilDouble);

        printAngka(10);
        printAngka(10.5d);
        
    }
    //fungsi overload
    //dengan variable yang sama, maka akan memilih fungsi mana yang bertipe data sesuai

    //int + int
    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }
    //double + int
    private static double tambah(double angka1, int angka2){
        return angka1 + angka2;
    }
    //int + double
    private static double tambah(int angka1, double angka2){
        return angka1 + angka2;
    }


    // fungsi untuk print

    //double
    private static void printAngka(double angkatDouble){
        System.out.println("angka ini adalah double dengan nilai = " + angkatDouble);
    }
    //integer
    private static void printAngka(int angkaInteger){
        System.out.println("angka ini adalah integer dengan nilai = " + angkaInteger);

    }
}
