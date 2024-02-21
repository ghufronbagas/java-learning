import java.util.Scanner;

public class TIF_B_UTP_MenjagaGerbangTol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String platNomor = in.nextLine();

        String waktu = in.next();

        String intensitasAwal = in.nextLine();
        Scanner pemisah1 = new Scanner (intensitasAwal);
        int intensitas1 = pemisah1.nextInt();
        int intensitas2 = pemisah1.nextInt();
        int intensitas3 = pemisah1.nextInt();

        // System.out.println(intensitas1);
        // System.out.println(intensitas2);
        // System.out.println(intensitas3);

        String kecepatanAwal = in.nextLine();
        Scanner pemisah2 = new Scanner (kecepatanAwal);
        int kecepatan1 = pemisah2.nextInt();
        int kecepatan2 = pemisah2.nextInt();

        // System.out.println(kecepatan1);
        // System.out.println(kecepatan2);

        if(kecepatan1 > kecepatan2){
            if(waktu.equals("pagi")){
                if(intensitas1 < intensitas2 && intensitas1 < intensitas3){
                    System.out.printf("%s lewat gerbang kiri\n", platNomor);
                }else if(intensitas2 < intensitas1 && intensitas2 < intensitas3){
                    System.out.printf("%s lewat gerbang tengah\n", platNomor);
                }else if( intensitas3 < intensitas1 && intensitas3 < intensitas2){
                    System.out.printf("%s lewat gerbang kanan\n", platNomor);
                }
            }else if(waktu.equals("siang") || waktu.equals("malam")){
                if(intensitas1 > intensitas2 && intensitas1 > intensitas3){
                    System.out.printf("%s lewat gerbang kiri\n", platNomor);
                }else if(intensitas2 > intensitas1 && intensitas2 > intensitas3){
                    System.out.printf("%s lewat gerbang tengah\n", platNomor);
                }else if( intensitas3 > intensitas1 && intensitas3 > intensitas2){
                    System.out.printf("%s lewat gerbang kanan\n", platNomor);
                }
            }else if(waktu.equals("sore")){
                if((intensitas1 > intensitas2  && intensitas1 < intensitas3) || (intensitas1 < intensitas2  && intensitas1 > intensitas3)){

                    System.out.printf("%s lewat gerbang kiri\n", platNomor);
                }else if((intensitas2 > intensitas1 && intensitas2 < intensitas3) || (intensitas2 < intensitas1 && intensitas2 > intensitas3)){
                    System.out.printf("%s lewat gerbang tengah\n", platNomor);
                }else if((intensitas3 > intensitas1 && intensitas3 < intensitas2) || (intensitas3 < intensitas1 && intensitas3 > intensitas2)){
                    System.out.printf("%s lewat gerbang kanan\n", platNomor);
                }
            }
        
        }else {
                if(intensitas1 < intensitas2 && intensitas1 < intensitas3){
                    intensitas1 ++;
                    System.out.printf("%s lewat gerbang kiri\n", platNomor);
                    if (intensitas1 == intensitas2)
                    System.out.printf("%s lewat gerbang tengah\n", platNomor);
                    else if(intensitas1 == intensitas3)
                    System.out.printf("%s lewat gerbang kanan\n", platNomor);
                else if()

                    
                }else if(intensitas2 < intensitas1 && intensitas2 < intensitas3){
                    System.out.printf("%s lewat gerbang tengah\n", platNomor);
                }else if( intensitas3 < intensitas1 && intensitas3 < intensitas2){
                    System.out.printf("%s lewat gerbang kanan\n", platNomor);
                }
        }




        //     if(waktu.equals("pagi")){
        //         if(intensitas1 > intensitas2 && intensitas1 > intensitas3){
                    
        //         }else if(intensitas2 > intensitas1 && intensitas2 > intensitas3){

        //         }else if(intensitas3 > intensitas1 && intensitas3 > intensitas2){

        //         }
        //     }
        








    }
    
}
