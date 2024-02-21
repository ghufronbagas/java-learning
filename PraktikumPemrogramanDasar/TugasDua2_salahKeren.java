import java.util.Scanner;

public class TugasDua2_salahKeren {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double presensi;
        double nilaiTugas, nilaiUTS, nilaiUAS, rataNilai;

        System.out.println("""
                +--------------------------------------------+
                | PROGRAM MENCARI STATUS KELULUSAN DAN NILAI | 
                +--------------------------------------------+
                """);
        System.out.print("Masukkan jumlah presensi siswa :");
        presensi = in.nextDouble(); System.out.println("");

        System.out.println("=--- Input Nilai ---=");

        System.out.print("Tugas\t:");
        nilaiTugas = in.nextDouble();

        System.out.print("UTS\t:");
        nilaiUTS = in.nextDouble();

        System.out.print("UAS\t:");
        nilaiUAS = in.nextDouble(); System.out.println("");
        
        rataNilai = (nilaiTugas + nilaiUTS + nilaiUAS) / 3;
        String nilaiConvert = rataNilai <= 64 && rataNilai >= 50 ? "D" : "E";

        System.out.println("---= Hasil Perhitungan =---");

        if (rataNilai <= 64 || presensi < 20){
            System.out.println("Status : Tidak Lulus");
            System.out.println("Nilai  : "+ nilaiConvert);
        }
        else if(rataNilai <= 100 && rataNilai >= 85){ if(presensi < 20){
            System.out.println("Status : Tidak lulus");
            System.out.println("Nilai  : A");
            }   else{
                System.out.println("Status : Lulus");
                System.out.println("Nilai  : A");
                }
        }
        else if(rataNilai <= 84 && rataNilai >= 70){ if(presensi < 20){
            System.out.println("Status : Tidak Lulus");
            System.out.println("Nilai  : B");
            }   else{
                System.out.println("Status : Lulus");
                System.out.println("Nilai  : B");
                }
        }
        else if(rataNilai <= 69 && rataNilai <= 65){ if(presensi < 20){
            System.out.println("Status : Tidak Lulus");
            System.out.println("Nilai  : C");
            }   else{
                System.out.println("Status : Lulus");
                System.out.println("Nilai  : C");
                }
        }


        in.close();




    }
    
}
