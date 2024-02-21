import java.util.*;

public class BbLatianFungsiMenggambar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // // methode tidak efisien dan tidak menggunakan method void
        // int panjang, lebar;
        // panjang = 10;
        // lebar = 4;
        // for (int i = 0; i < lebar; i++) {
        //     for (int j = 0; j < panjang; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");
        // }



        // lebih efisien jika menggunakan fungsi void
        gambar(10, 4);

        // menangkap input dan masukkan pada looping agar program terulang
        while (true) {
            System.out.print("Masukkan panjang :");
            int inputPanjang = in.nextInt();
            System.out.print("Masukkan lebar :");
            int inputLebar = in.nextInt();
            gambar(inputPanjang, inputLebar);

            // System.out.println("Luas bangun :" + luas(inputPanjang, inputLebar));
            // System.out.println("Keliling bangun :" + keliling(inputPanjang, inputLebar));

        // membuat output luas dan keliling menggunakan method
            menampilkanKelilingDanLuas(inputPanjang, inputLebar);
            System.out.println("========================\n");
            
            
            in.close();
        }

    }
    // memakai VOID karena tidak perlu mengembalikan sesuatu
    private static void gambar(int panjang, int lebar){ // disarankan memakai private, karena fungsi ini hanya akan dipakai dikelas ini
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    // TIDAK memakai void karena perlu untuk mengembalikan luasHasil
    private static int luas(int panjang, int lebar){
        int luasHasil = panjang * lebar;
        return luasHasil;
    }
    // TIDAK memakai void karena perlu untuk mengembalikan luasHasil
    private static int keliling(int panjang, int lebar){
        int kelilingHasil = (panjang + lebar) * 2;
        return kelilingHasil;
    }
    //
    private static void menampilkanKelilingDanLuas(int panjang, int lebar){
        System.out.println("Luas bangun :" + luas(panjang, lebar));
        System.out.println("Keliling bangun :" + keliling(panjang, lebar));
    }
}
