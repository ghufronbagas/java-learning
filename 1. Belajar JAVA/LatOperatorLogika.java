import java.util.*;

public class LatOperatorLogika {

    public static void main(String[] args){ //19 19 19 19 19 19 19 19 19

        //membuat sebuah objek untuk menangkap input dari user

        Scanner inputUser = new Scanner(System.in);

        //program sederhana untuk menebak sebuah angka

        int nilaiBenar = 8;
        int nilaiTebakan;
        boolean statusTebakan;


        System.out.print("masukkan nilai tebakan anda = ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("tebakkan nilai anda adalah = " + nilaiTebakan);

        //operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda = " + statusTebakan);

        //operasi aljabar boolean
        System.out.println("masukkan nilai antara 4 dan 7");
        nilaiTebakan = inputUser.nextInt();
    
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 7);

        /*
          a | b | c
          0   0   0
          0   1   0
          1   0   0
          1   1   1

         */

         System.out.println("selamat tebakan anda = " + statusTebakan);

         inputUser.close();





    }
    
}
