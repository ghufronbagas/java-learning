import java.util.*;

public class BbFungsiRekursif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int nilai = in.nextInt();
        System.out.println("anda memasukkan nilai :" + nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);

        int faktorial = faktorialNilai(nilai);
        System.out.println("nilai faktorial = " + faktorial);

        in.close();
    }  
    //penambahan nilai berikutnya
    private static int jumlahNilai(int parameter){
        System.out.println("parameter : " + parameter);
        if(parameter == 0){
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);
    }
    //faktorial
    private static int faktorialNilai(int parameter){
        System.out.println("parameter : " + parameter);
        if(parameter == 1){
            return parameter;
        }
        return parameter * faktorialNilai(parameter - 1);
    }

    //fungsi rekursif sederhana
    private static void printNilai(int parameter){    // funsgsi rekursif ini harus memiliki kondisi yang membuat fungsi ini berulang
        System.out.println("nilai = " + parameter);
        if(parameter == 0){      // kondisinya
            return;            // return ini membuat fungsi berhenti looping
        }
        parameter--;
        printNilai(parameter);
    }

}
