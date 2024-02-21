public class DataConversion {
    public static void main(String[] args) { //5555555555555

        //program untuk konversi data
        int nilaiInt = 450; //32bit
        System.out.println("nilai int = " + nilaiInt);

        //memperluas ke tipe data yang lebih luas
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        //memperluas ke tipe yang lebih kecil
        byte nilaiByte =(byte) nilaiInt;       //casting operator(tambahkan tipe data)
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);
        //meskipun setalah di casting opr, data hasilInt akan berputar dan menyesuaikan nilai max data byte


        //Casting Pembagian *PENTING
        float a = 10;
        int b = 4;


        float e = a/b;
        System.out.printf("%f / %d = %f \n",a,b,e);
        //satu data diganti float, maka hasil akan mengikuti(terlihat dr banya bilangan)

//===============================================================CONTOH

//SALAH = sebelum di konversi 
        int g = 20;
        int h = 8;
        
        float u = g / h;      //sebelum di konversi hasil masih 2,00 SALAH
        System.out.printf("%d / %d = %f \n",g,h,u);

//BENAR = setalah di konversi

        int x = 20;
        int y = 8;
        
        float z = (float)x / y;      //tinggal menambahkan co agar hasil menjadi benar
        System.out.printf("%d / %d = %f \n",x,y,z);
        // setelah di konversi hasil menjadi 2,500 BENAR


    


    }
    
}
