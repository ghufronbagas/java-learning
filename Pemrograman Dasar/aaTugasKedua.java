import java.util.*;

public class aaTugasKedua {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double kuis, uas, tugas, nilaiAkhirUAS, nilaiAkhirKuis, nilaiAkhir;
        nilaiAkhir = 0;

        System.out.print("masukkan nilai kuis \t: ");
        kuis = input.nextDouble();
        System.out.print("masukkan nilai uas \t: ");
        uas = input.nextDouble();
        System.out.print("masukkan nilai tugas \t: ");
        tugas = input.nextDouble();


        if(kuis > uas){
            nilaiAkhirKuis = ((0.4 * kuis) + (0.4 * uas) + (0.2 * tugas));
            nilaiAkhir = nilaiAkhirKuis;
        } else if ( uas > kuis){
            nilaiAkhirUAS = ((0.3 * kuis) + (0.5 * uas) + (0.2 * tugas));
            nilaiAkhir = nilaiAkhirUAS;
        }

        System.out.println("nilai akhir anda = "+ nilaiAkhir);
        if (nilaiAkhir <= 100 && nilaiAkhir >= 85){
            System.out.println("nilai akhir anda memiliki bobot 4 dengan kategori A(Sangat baik)");

        }else if (nilaiAkhir <= 84 && nilaiAkhir >= 75){
            System.out.println("nilai akhir anda memiliki bobot 3 dengan kategori B(Baik)");

        }else if (nilaiAkhir <= 74 && nilaiAkhir >= 65){
            System.out.println("nilai akhir anda memiliki bobot 2 dengan kategori C(Cukup)");

        }else if (nilaiAkhir <= 64 && nilaiAkhir >= 50){
            System.out.println("nilai akhir anda memiliki bobot 1 dengan kategori D(Kurang)");

        }else if (nilaiAkhir <= 49 && nilaiAkhir >= 0){
            System.out.println("nilai akhir anda tidak memiliki bobot dan memiliki kategori E(Gagal)");
        }
        





    }
}
