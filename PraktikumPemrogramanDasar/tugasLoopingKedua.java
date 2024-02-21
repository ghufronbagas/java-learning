import java.util.*;

public class tugasLoopingKedua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double p, l, t;
        double r;
        double volume;
        double luasPermukaan;


        while(true) {
            System.out.println("""
                +===========================================+
                + SELAMAT DATANG DI KALKULATOR BANGUN RUANG +
                +===========================================+
                """);

            System.out.println("""
                    Menu :
                    1. Menghitung Volume Balok
                    2. Menghitung Volume Bola
                    3. Menghitung Volume Silinder
                    0. Mengakhiri Program ======
                    """);
            System.out.print("Masukkan pilihan anda : ");
            int pilihan = in.nextInt();

            if(pilihan==1){
                System.out.println("=== Kalkulator Bangun Balok ===");
                System.out.print("Panjang Balok : ");
                p = in.nextDouble();
                System.out.print("Lebar Balok : ");
                l = in.nextDouble();
                System.out.print("Tinggi Balok : ");
                t = in.nextDouble();
                volume = p*l*t;
                System.out.printf("Volume balok adalah : %.3f \n", volume);
                luasPermukaan = 2*(p*l + p*t + l*t);
                System.out.printf("Luas permukaan balok adalah : %.3f \n", luasPermukaan);

                System.out.print("""
                        ========================================================
                        Lanjut Program --> 1
                        Keluar Program --> 0
                        Masukkan pilihan anda : """);
                int x = in.nextInt();
                if(x==1){
                    System.out.println("========================================================\n");
                    continue;
                }else if(x==0)break;


            } else if(pilihan==2){
                System.out.println("=== Kalkulator Bangun Bola ===");
                System.out.print("Jari - jari Bola : ");
                r = in.nextDouble();
                volume = 4/3 * Math.PI * Math.pow(r, 3);
                System.out.printf("Volume bola adalah : %.3f \n", volume);
                luasPermukaan = 4 * Math.PI * Math.pow(r, 2);
                System.out.printf("Luas permukaan bola adalah : %.3f \n", luasPermukaan);

                System.out.print("""
                        ========================================================
                        Lanjut Program --> 1
                        Keluar Program --> 0
                        Masukkan pilihan anda : """);
                int x = in.nextInt();

                if(x==1){
                    System.out.println("========================================================\n");
                    continue;
                }else if(x==0)break;


            } else if(pilihan==3){
                System.out.println("=== Kalkulator Bangun Silinder ===");
                System.out.print("Jari - jari Silinder : ");
                r = in.nextDouble();
                System.out.print("Tinggi Silinder : ");
                t = in.nextDouble();

                volume = Math.PI * Math.pow(r, 2) * t;
                System.out.printf("Volume silinder adalah : %.3f \n", volume);
                luasPermukaan = 2 * Math.PI * r * (r + t);
                System.out.printf("Luas permukaan bola adalah : %.3f \n", luasPermukaan);

                System.out.print("""
                        ========================================================
                        Lanjut Program --> 1
                        Keluar Program --> 0
                        Masukkan pilihan anda : """);
                int x = in.nextInt();
                if(x==1){
                    System.out.println("========================================================\n");
                    continue;
                }else if(x==0)break;

                
            } else if(pilihan==0){
                break;


            } else{
                System.out.println("Input yang anda masukkan salah");
                System.out.print("""
                        ========================================================
                        Lanjut Program --> 1
                        Keluar Program --> 0
                        Masukkan pilihan anda : """);
                int x = in.nextInt();
                if(x==1){
                    System.out.println("========================================================\n");
                    continue;
                }else if(x==0)break;
            }
        }

        System.out.println("Anda telah keluar dari program perhitungan, Terimakasih . . .");
        in.close();
    }
    
}
