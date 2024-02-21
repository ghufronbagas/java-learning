import java.util.Scanner;

public class TugasDua1_BangunDatar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double lingJari, luasLing, kelilingLing;
        double ppPanjang, ppLebar, luasPP, kelilingPP;
        double segitigaAlas, segitigaTinggi, segitigaMiring, luasSegitiga, kelilingSegitiga;
        String satuan = "", satuanKuadrat = "";

        int pilihan;
        System.out.println(" ");

        System.out.println("""
                +===========================================+
                + SELAMAT DATANG DI KALKULATOR BANGUN DATAR +
                +===========================================+
                """);

        System.out.println("Pilih operasi yang anda butuhkan -->");

        System.out.println("1) Luas dan Keliling Lingkaran");
        System.out.println("2) Luas dan Keliling Persegi Panjang");
        System.out.println("3) Luas dan Kelliling Segitiga siku-siku \n");

        System.out.print("Masukkan nomor pilihan anda :");
        pilihan = in.nextInt();
        
        if(pilihan != 1 && pilihan != 2 && pilihan != 3){
            System.out.print("Input nomor operasi yang anda masukkan salah!");
        } else {
            System.out.print("Masukkan satuan pengukuran :");
            satuan = in.next();
            satuan = " " + satuan;
            satuanKuadrat = satuan + "^2";
            } System.out.println("");

        switch(pilihan){
            case 1: 
                System.out.println("===== LINGKARAN =====");
                System.out.print("Masukkan jari-jari lingkaran :");
                lingJari = in.nextDouble();
                System.out.println("---->");

                luasLing = Math.PI * (lingJari * lingJari);
                System.out.println("Luas lingkaran yang anda minta adalah \t\t:"+ luasLing + satuanKuadrat);
                kelilingLing = Math.PI * (lingJari + lingJari);
                System.out.println("Keliling lingkaran yang anda minta adalah \t:"+ kelilingLing + satuan);
            break;

            case 2:
                System.out.println("===== Persegi Panjang =====");
                System.out.print("Masukkan panjang :");
                ppPanjang = in.nextDouble();
                System.out.print("Masukkan lebar :");
                ppLebar = in.nextDouble();
                System.out.println("--->");

                luasPP = ppPanjang * ppLebar;
                System.out.println("Luas persegi panjang yang anda minta adalah :"+ luasPP + satuanKuadrat);
                kelilingPP = (2 * ppPanjang) + (2 * ppLebar);
                System.out.println("Keliling persegi panjang yang anda minta adalah :"+ kelilingPP + satuan);
                break;

            case 3:
                System.out.println("===== Segitiga =====");
                System.out.print("Masukkan alas :");
                segitigaAlas = in.nextDouble();
                System.out.print("Masukkan tinggi :");
                segitigaTinggi = in.nextDouble();
                System.out.print("Masukkan sisi miring :");
                segitigaMiring = in.nextDouble();
                System.out.println("--->");

                luasSegitiga = 0.5 * segitigaAlas * segitigaTinggi;
                System.out.println("Luas segitiga yang anda minta adalah :"+ luasSegitiga + satuanKuadrat);
                kelilingSegitiga = segitigaAlas + segitigaMiring + segitigaTinggi;
                System.out.println("Keliling segitiga yang anda minta adalah"+ kelilingSegitiga + satuan);
                break;
        }

        in.close();
        System.out.println("\n");

    }
}

