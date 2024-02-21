import java.util.*;

public class SI_A_JosephJoestar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String nama = in.nextLine();
        String namaBarang = in.nextLine();
        double hargaBarang = in.nextInt();
        double jumlahBarang = in.nextInt();

        double totalHargaBeli = hargaBarang * jumlahBarang;
        double pajak = totalHargaBeli * 0.07;
        double modal = totalHargaBeli + pajak;

        double totalJualKembali = modal + (modal * 10/100);
        double jualKembaliSatuan = totalJualKembali / jumlahBarang;
        double totalKeuntungan = totalJualKembali - totalHargaBeli;

        System.out.println("============================================");
        System.out.println("===Aplikasi Untuk Memulai Bisnis Reseller===");
        System.out.println("============================================");
        System.out.printf("Nama             :%26s\n", nama);
        System.out.printf("Nama Barang      :%26s\n", namaBarang);
        System.out.printf("Jumlah           :%26.0f\n", jumlahBarang);
        System.out.printf("Harga Satuan     :%26.0f\n", hargaBarang); 
        System.out.println("============================================");
        System.out.printf("Total            :%26.0f\n", totalHargaBeli);
        System.out.printf("Pajak 7%%         :%26.0f\n", pajak);
        System.out.printf("Modal            :%26.0f\n", modal);
        System.out.println("============================================");
        System.out.println("Harga Jual kembali 10% keuntungan dari Modal");
        System.out.println("============================================");
        System.out.printf("Total Penjualan  :%26.0f\n", totalJualKembali);
        System.out.printf("Harga Satuan     :%26.0f\n", jualKembaliSatuan);
        System.out.printf("Total Keuntungan :%26.0f\n", totalKeuntungan);
        System.out.println("============================================");
        
in.close();
        /*
         *  ============================================
            ===Aplikasi Untuk Memulai Bisnis Reseller===
            ============================================
            Nama             :             Jolyn Joestar
            Nama Barang      :                  Pelembab
            Jumlah           :                        56
            Harga Satuan     :                     78090
            ============================================
            Total            :                   4373040
            Pajak 7%         :                    306113
            Modal            :                   4679153
            ============================================
            Harga Jual kembali 10% keuntungan dari Modal
            ============================================
            Total Penjualan  :                   5147068
            Harga Satuan     :                     91912
            Total Keuntungan :                    774028
            ============================================
         */







    }
    
}
