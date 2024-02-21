import java.util.*;

public class SI_A_MenghitungBangunRuang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String pilihan = in.nextLine();

        
        switch(pilihan){
            case "balok": 
                double panjang = in.nextDouble();
                double panjangM = panjang /100;

                double lebar = in.nextDouble();
                double lebarM = lebar /100;
                
                double tinggi = in.nextDouble();
                double tinggiM = tinggi /100;

                double volume1 = (panjangM * lebarM * tinggiM);
                System.out.printf("volume bangunan = %.5f m3", volume1);
                    break;

            case "prisma segitiga":
                double alas = in.nextDouble();
                double alasM = alas /100;

                double tinggiSegitiga = in.nextDouble();
                double tinggiSegitigaM = tinggiSegitiga /100;
                
                double tinggiPrisma = in.nextDouble();
                double tinggiPrismaM = tinggiPrisma /100;

                double volume2 = (0.5 * alasM * tinggiSegitigaM) * tinggiPrismaM;
                System.out.printf("volume bangunan = %.5f m3", volume2);
                    break;

            case "tabung":
                double diameter = in.nextDouble();
                double jariJari = diameter / 2;
                double jariJariM = jariJari / 100;

                double tinggiTabung = in.nextDouble();
                double tinggiTabungM = tinggiTabung /100;

                    if(jariJari % 7 == 0){
                        double volume3 = (22 / 7 * jariJariM * jariJariM) * tinggiTabungM;
                        System.out.printf("volume bangunan = %.5f m3", volume3);
                    }else {
                        double volume3 = (3.14 * jariJariM * jariJariM) * tinggiTabungM;
                        System.out.printf("volume bangunan = %.5f m3", volume3);
                    }
                    break;

                case "bola":
                double diameterBola = in.nextDouble();
                double jariJariBolaM = (diameterBola / 100) / 2;
            
                double volume4 = (1.33333333 * 3.14 * jariJariBolaM * jariJariBolaM * jariJariBolaM);
                System.out.printf("volume bangunan = %.5f m3", volume4);
                break;
                        
                    // if(jariJariBola % 7 == 0){
                    //     double volume4 = 4/3 * 22/7 * jariJariBolaM * jariJariBolaM * jariJariBolaM;
                    //     System.out.printf("volume bangunan = %.5f m3", volume4);
                    // }else {
                    //     double volume4 = 4/3 * 3.14 * jariJariBolaM * jariJariBolaM * jariJariBolaM ;
                    //     System.out.printf("volume bangunan = %.5f m3", volume4);
                    //     break;
                    // }
            }



        //  if (pilihan == "balok") {
        //         double panjang = in.nextDouble();
        //         double lebar = in.nextDouble();
        //         double tinggi = in.nextDouble();

        //         double volume = panjang * lebar * tinggi;
        //         System.out.printf("Volume bangungan = %.5f", volume);
        //     }else if(pilihan == "prisma segitiga"){
        //         double alas = in.nextDouble();
        //         double tinggiSegitiga = in.nextDouble();
        //         double tinggiPrisma = in.nextDouble();

        //         double volume = 1/3 * alas * tinggiPrisma * tinggiSegitiga;
        //         System.out.printf("Volume bangungan = %.5f", volume);
        //     }else if(pilihan == "tabung"){
        //         double diameter = in.nextDouble();
        //         double jariJari = diameter / 2;
        //         double tinggiTabung = in.nextDouble();
        //             if(jariJari % 7 == 0){
        //                 double volume = 22 / 7 * jariJari * jariJari * tinggiTabung;
        //                 System.out.printf("Volume bangungan = %.5f", volume);
        //             }else {
        //                 double volume = 3.14 * jariJari * jariJari;
        //                 System.out.printf("Volume bangungan = %.5f", volume);
        //             }
        //     }else if(pilihan == "bola"){
        //         double diameter = in.nextDouble();
        //         double jariJari = diameter / 2;
        //             if(jariJari % 7 == 0){
        //                 double volume = 22 / 7 * jariJari * jariJari;
        //                 System.out.printf("Volume bangungan = %.5f", volume);
        //             }else {
        //                 double volume = 3.14 * jariJari * jariJari;
        //                 System.out.printf("Volume bangungan = %.5f", volume);
        //             }
            // } 
            in.close();


/*
 Budi adalah seorang bagian cleaning service museum. Banyak sekali barang-barang pra sejarah yang perlu dirawat.
  Akan tetapi, budi terlihat bingung dalam membersihkan barang tersebut karena volumenya yang beragam. 
  Kamu sebagai programmer zaman now bantulah temanmu budi untuk menentukan volum dari barang museum dengan ketentuan yang akan dijelaskan dibawah...
Input Format

baris pertama bentuk barang
baris kedua ukuran barang dan dalam bentuk cm

Constraints

kondisi barang:
1. balok
urutan input ukuran barang : panjang, lebar, tinggi
2. prisma segitiga
urutan input ukuran barang : alas, tinggi segitiga, tinggi prisma
3. tabung
urutan input ukuran barang : diameter, tinggi tabung
phi yang dipakai jika habis dibagi 7 menggunakan 22/7 jika tidak maka menggunakan 3.14
4. bola
urutan input ukuran barang : diameter
         * 
         */
  }

}       
        
