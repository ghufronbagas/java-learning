import java.io.*;
import java.util.*;

public class Yasin_MenjagaGerbangTol {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //NAMA:MUHAMMAD YASIN HAKIM
        //NIM:225150200111036
        
        Scanner in = new Scanner(System.in);

        String platNomor = in.nextLine();
        String waktu = in.nextLine();
        int kiri = in.nextInt();
        int tengah = in.nextInt();
        int kanan = in.nextInt();
        int kecPertama = in.nextInt();
        int kecKedua = in.nextInt();
        String keluar ="";
        
        if(kecPertama>kecKedua){
            switch(waktu){
                case "pagi":
                    if(kiri<=kanan && kiri<=tengah)
                        keluar = "kiri";
                    else if(kanan<=tengah)
                        keluar = "kanan";
                    else
                        keluar = "tengah";
                    break;
                case "siang":
                    if(kiri>=kanan && kiri>=tengah)
                        keluar = "kiri";
                    else if(kanan>=tengah)
                        keluar = "kanan";
                    else
                        keluar = "tengah";
                    break;
                case"malam":
                    if(kiri>=kanan && kiri>=tengah)
                        keluar = "kiri";
                    else if(kanan>=tengah)
                        keluar = "kanan";
                    else
                        keluar = "tengah";
                    break;
                case "sore":
                    if(kiri>=kanan && kiri<=tengah ||kiri<=kanan && kiri>=tengah)
                        keluar = "kiri";
                    else if(kanan>=kiri && kanan<=tengah ||kanan<=kiri && kanan>=tengah)
                        keluar = "kanan";
                    else
                        keluar = "tengah";
                    break;
            }
           
        }
        else{
            if(kiri<kanan && kiri<tengah){
                kiri ++;
                keluar = "kiri";
                if(kiri == kanan){
                    keluar = "kanan";
                }else if (kiri==tengah){
                    keluar = "tengah";
                }}
            else if(kanan<tengah){
                kanan++;
                keluar = "kanan";
                if(kanan==tengah)
                    keluar = "tengah";
                else if(kanan==kiri) 
                    keluar = "kiri";
            }
            else{
                keluar = "tengah";
                tengah++;
                if (tengah==kanan)
                    keluar = "kanan";
                else if(tengah==kiri)
                    keluar = "kiri";
            }
            }
            System.out.printf("%s lewat gerbang %s", platNomor, keluar);
            
    }
}