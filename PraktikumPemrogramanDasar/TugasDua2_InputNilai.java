import java.util.Scanner;

public class TugasDua2_InputNilai {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int presensi;
        int nilaiTugas, nilaiUTS, nilaiUAS, rataNilai;

        System.out.println("""
                +--------------------------------------------+
                | PROGRAM MENCARI STATUS KELULUSAN DAN NILAI | 
                +--------------------------------------------+
                """);
        System.out.print("Masukkan jumlah presensi siswa :");
        presensi = in.nextInt(); 
        System.out.println("");

        if(presensi < 20){
            System.out.println("---= Hasil Perhitungan =---");
            System.out.println("Status :Tidak Lulus");
            System.out.println("Nilai  :E");
            }   else{
                    System.out.println("=--- Input Nilai ---=");

                    System.out.print("Tugas\t:");
                    nilaiTugas = in.nextInt();

                    System.out.print("UTS\t:");
                    nilaiUTS = in.nextInt();

                    System.out.print("UAS\t:");
                    nilaiUAS = in.nextInt(); System.out.println("");
                    
                    rataNilai = (nilaiTugas + nilaiUTS + nilaiUAS) / 3;

                    System.out.println("---= Hasil Perhitungan =---");

                    if(rataNilai <= 100 && rataNilai >= 85){
                        System.out.println("Status : LULUS");
                        System.out.println("Nilai  : A");
                    }   else if(rataNilai < 85 && rataNilai >= 70){
                            System.out.println("Status : LULUS");
                            System.out.println("Nilai  : B");
                    }   else if(rataNilai < 70 && rataNilai >= 65){
                            System.out.println("Status : LULUS");
                            System.out.println("Nilai  : C");
                    }   else if(rataNilai < 65 && rataNilai >= 50){
                            System.out.println("Status : TIDAK LULUS");
                            System.out.println("Nilai  : D");
                    }   else if(rataNilai < 50 && rataNilai >= 0){
                            System.out.println("Status : TIDAK LULUS");
                            System.out.println("Nilai  : E");
                    } else{System.out.println("Input nilai yang anda masukkan salah");
                }
            }


        in.close();


    }
}
