import java.util.Scanner;

public class UTP1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int ks = in.nextInt();
        int kv = in.nextInt();
        int c = in.nextInt();
        int mr = in.nextInt();

        double americano = 20000;
        double kSusu = 28000;
        double kVietnam = 23000;
        double cappucino = 31000;
        double mochaRum = 35000;

        double totalA = americano * a;
        double totalKS = kSusu * ks;
        double totalKV = kVietnam *kv;
        double totalC = cappucino * c;
        double totalMR = mochaRum * mr;

        double adiskon = 0, ksdiskon = 0, kvdiskon = 0, cdiskon = 0, mrdiskon = 0;


        if(a > 3)
        adiskon = 0.05 * totalA;

        if(ks > 2)
        ksdiskon = 0.08 * totalKS;

        if(kv > 4)
        kvdiskon = 0.12 * totalKV;

        if(mr > 2)
        mrdiskon = 10000;

        double hargaA = totalA - adiskon;
        double hargaKS = totalKS - ksdiskon;
        double hargaKV = totalKV - kvdiskon;
        double hargaC = totalC - cdiskon;
        double hargaMR = totalMR - mrdiskon;

        double totalAWAL = hargaA + hargaKS + hargaKV + hargaC + hargaMR;
        double totalAKHIR = 0;

        if(totalAWAL > 250000){
            totalAKHIR = totalAWAL - (totalAWAL * 0.1);

        } else{
            totalAKHIR = totalAWAL;
        }

        System.out.printf("Harga total americano    : Rp%.1f\n", hargaA);
        System.out.printf("Harga total kopi susu    : Rp%.1f\n", hargaKS);
        System.out.printf("Harga total kopi vietnam : Rp%.1f\n", hargaKV);
        System.out.printf("Harga total cappucino    : Rp%.1f\n", hargaC);
        System.out.printf("Harga total mocha rum    : Rp%.1f\n", hargaMR);
        System.out.println("=====================================");
        System.out.printf("Total harga pesanan      : Rp%.1f\n", totalAWAL);
        System.out.printf("Harga yang harus dibayar : Rp%.1f\n", totalAKHIR);




        
    }
}
