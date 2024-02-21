public class AaBreakContinue {
    public static void main(String[] args){
        
        // break, continue, and return

        int a = 0;

        // //break
        // while(true){
        //     a++;
        //     System.out.println("looping ke - "+ a);
        //     if(a==10){
        //         break;// ini adalah keywoard untuk memaksa agar program terhenti
        //     } else if(a == 8){
        //         continue;
        //     }
        // }


        // //continue
        // while(true){
        //     System.out.println("awal program");
        //     a++;

        //     if(a==10){
        //         break;         // ini adalah keywoard untuk memaksa agar program terhenti
        //     } else if(a == 8){
        //         continue;      // ini adalah keywoard yang akan memaksa program terulang kembali dan mengabaikan proses dibawahnya
        //     }

        //     System.out.println("looping ke - "+ a);
        // }

        //return
        while(true){
            System.out.println("awal program");
            a++;

            if(a==10){
                break;      // ini adalah keywoard untuk memaksa agar program terhenti
            } else if(a == 8){
                continue;   // ini adalah keywoard yang akan memaksa program terulang kembali dan mengabaikan proses dibawahnya
            } else if(a == 7){
                return;     // keyword yang digunakan untuk keluar dari method utama, jadi seluruh program dibawahnya tidak akan dilakukan 
            }

            System.out.println("looping ke - "+ a);
        }


        
        System.out.println("akhir dari looping - "+ a);

    }
    
}
