import java.util.*;

public class laprajArray2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] ekonomi = {"Ekonomi", "50000", "2 %", "Tidak ada", "Tidak ada"};
        String[] bisnis = {"Bisnis", "100000", "5 %", "Ada", "Tidak ada"};
        String[] eksekutif = {"Eksekutif", "200000", "7 %", "Ada", "Tidak ada"};
        String[] pariwisata = {"Pariwisata", "300000", "10 %", "Ada", "Ada"};

        //maksimal pesanan tiap looping adalah 15
        String[] order = new String [15];
        int a = 0;  


        //keperluan formating
        String x = "==================================================================";
        String z = "------------------------------------------------------------------";

        String x2 = "=======================================================================";
        String z2 = "-----------------------------------------------------------------------";


        while(true){

            System.out.println("""
                    Menu :
                    1. Melihat Daftar Kereta Api
                    2. Melihat Daftar Kereta Api yang memiliki AC
                    3. Melihat Daftar Kereta Api yang memiliki Colokan 
                    4. Memesan Tiket Kereta Api 
                    5. Melihat Pesanan Tiket
                    0. Keluar
                    """);

                    System.out.print("Masukkan Pilihan : ");
                    int pilihan = in.nextInt();
                    System.out.println("\n");

                    switch(pilihan){
                        case 1:
                            System.out.printf("%10s |%10s |%12s |%12s |%12s |\n","Jenis", "Harga", "Diskon", "AC", "Colokan");
                            System.out.printf("%s\n", x);
                            System.out.printf("%10s |%10s |%12s |%12s |%12s |\n",ekonomi[0], ekonomi[1], ekonomi[2], ekonomi[3], ekonomi[4]);
                            System.out.printf("%s\n", z);
                            System.out.printf("%10s |%10s |%12s |%12s |%12s |\n",bisnis[0], bisnis[1], bisnis[2], bisnis[3], bisnis[4]);
                            System.out.printf("%s\n", z);
                            System.out.printf("%10s |%10s |%12s |%12s |%12s |\n",eksekutif[0], eksekutif[1], eksekutif[2], eksekutif[3], eksekutif[4]);
                            System.out.printf("%s\n", z);
                            System.out.printf("%10s |%10s |%12s |%12s |%12s |\n",pariwisata[0], pariwisata[1], pariwisata[2], pariwisata[3], pariwisata[4]);
                            System.out.printf("%s\n", z);
                            break;

                        case 2 :
                            System.out.printf("%10s |%10s |%12s |%12s |%12s |\n","Jenis", "Harga", "Diskon", "AC", "Colokan");
                            System.out.printf("%s\n", x);
                            System.out.printf("%10s |%10s |%12s |%12s |%12s |\n",bisnis[0], bisnis[1], bisnis[2], bisnis[3], bisnis[4]);
                            System.out.printf("%s\n", z);
                            System.out.printf("%10s |%10s |%12s |%12s |%12s |\n",eksekutif[0], eksekutif[1], eksekutif[2], eksekutif[3], eksekutif[4]);
                            System.out.printf("%s\n", z);
                            System.out.printf("%10s |%10s |%12s |%12s |%12s |\n",pariwisata[0], pariwisata[1], pariwisata[2], pariwisata[3], pariwisata[4]);
                            System.out.printf("%s\n", z);
                            break;

                        case 3 :
                            System.out.printf("%10s |%10s |%12s |%12s |%12s |\n","Jenis", "Harga", "Diskon", "AC", "Colokan");
                            System.out.printf("%s\n", x);
                            System.out.printf("%10s |%10s |%12s |%12s |%12s |\n",pariwisata[0], pariwisata[1], pariwisata[2], pariwisata[3], pariwisata[4]);
                            System.out.printf("%s\n", z);
                            break;

                        case 4 :
                            System.out.printf("%-3s |%10s |%10s |%12s |%12s |%12s |\n","No", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                            System.out.printf("%s\n", x2);
                            System.out.printf("%-3d |%10s |%10s |%12s |%12s |%12s |\n",1, ekonomi[0], ekonomi[1],  ekonomi[2], ekonomi[3], ekonomi[4]);
                            System.out.printf("%s\n", z2);
                            System.out.printf("%-3d |%10s |%10s |%12s |%12s |%12s |\n",2, bisnis[0], bisnis[1],  bisnis[2], bisnis[3], bisnis[4]);
                            System.out.printf("%s\n", z2);
                            System.out.printf("%-3d |%10s |%10s |%12s |%12s |%12s |\n",3, eksekutif[0], eksekutif[1],  eksekutif[2], eksekutif[3], eksekutif[4]);
                            System.out.printf("%s\n", z2);
                            System.out.printf("%-3d |%10s |%10s |%12s |%12s |%12s |\n",4, pariwisata[0], pariwisata[1],  pariwisata[2], pariwisata[3], pariwisata[4]);
                            System.out.printf("%s\n", z2);
                            
                            System.out.print("Masukkan kereta pilihan anda: ");
                            in.nextLine();
                            order[a] = in.nextLine();
                            a++;
                            break;
                            
                         
                        case 5 :
                        System.out.printf("%-3s |%10s |%10s |%12s |%12s |%12s |\n","No", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                        System.out.printf("%s\n", x2);
                        // System.out.println(Arrays.toString(order));
                        // System.out.printf("%-3d |%10s |%10s |%12s |%12s |%12s |\n",i + 1, kereta[], "Harga", "Diskon", "AC", "Colokan");
                            for (int i = 0; i < a; i++) {

                                switch (order[i]) {
                                    case "Ekonomi":
                                        System.out.printf("%-3d |%10s |%10s |%12s |%12s |%12s |\n",i + 1, ekonomi[0], ekonomi[1],  ekonomi[2], ekonomi[3], ekonomi[4]);
                                        System.out.printf("%s\n", z2);
                                        break;
    
                                    case "Bisnis":
                                        System.out.printf("%-3d |%10s |%10s |%12s |%12s |%12s |\n",i + 1, bisnis[0], bisnis[1],  bisnis[2], bisnis[3], bisnis[4]);
                                        System.out.printf("%s\n", z2);
                                        break;
    
                                    case "Eksekutif":
                                        System.out.printf("%-3d |%10s |%10s |%12s |%12s |%12s |\n",i + 1, eksekutif[0], eksekutif[1],  eksekutif[2], eksekutif[3], eksekutif[4]);
                                        System.out.printf("%s\n", z2);
                                        break;
    
                                    case "Pariwisata":
                                        System.out.printf("%-3d |%10s |%10s |%12s |%12s |%12s |\n",i + 1, pariwisata[0], pariwisata[1],  pariwisata[2], pariwisata[3], pariwisata[4]);
                                        System.out.printf("%s\n", z2);
                                        break;
                                    
                                    default:
                                        break;
                                }
                            }
                            break;

                        case 0:
                            in.close();
                            return;

                        default:
                            System.out.println("Input pilihan yang anda masukkan salah ");
                            break;

                            
                        }
                        

                    

        }



    }
    
}
