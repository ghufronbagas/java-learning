public class BbFungsiVoid {
    public static void main(String[] args) {

        //void dalam bhs inggris berarti HAMPA
    
        System.out.println(simple());

        fungsiVoid("ini adalah percobaan");

        //penggunaan fungsi void
        selamatPagi("sayang");
        selamatPagi("ibu");
        selamatPagi("kakak");

    }

    
    private static void fungsiVoid(String input){   //ini adalah fungsi tanpa pengembalian 
        System.out.println(input);                  // fungsi void adalah fungsi yang hanya melakukan aksi
    }

    private static void selamatPagi(String nama){
        System.out.println("Selamat pagi "+ nama);
    }

    private static float simple(){  // ini adalah fungsi dengan pengembalian
        return 10.0f;               // sehingga menggunakan return untuk mengembalikan nilainya
    }
}
