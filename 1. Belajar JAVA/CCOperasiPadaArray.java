import java.util.*;

public class CCOperasiPadaArray {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       int[] arrayAngka1 = {1,2,3,4,5};

       //merubah array manjadi string
       System.out.println("==== Merubah array menjadi String ====");
       System.out.println(Arrays.toString(arrayAngka1));
       print(arrayAngka1);

       //mengkopi array 
       System.out.println("==== Mengkopi Array ====");
       int[] arrayAngka2 = new int[5];
       print(arrayAngka1);
       print(arrayAngka2);
        //copy dengan loop 
        System.out.println("==== copy dengan loop");
        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        print(arrayAngka1);              // jika copy dengan cara ini maka address penyimpanan berbeda
        System.out.println(arrayAngka1);
        print(arrayAngka2);
        System.out.println(arrayAngka2);

        //menggunakan copyOf
        System.out.println("=== menggunakan copyOf ===");
        int[]arrayAngka3 = Arrays.copyOf(arrayAngka1, 5); // length dapat diatur meskipun sesuai dengan array copy nya
        print(arrayAngka1);// memiliki address yang berbeda
        System.out.println(arrayAngka1);
        print(arrayAngka3);
        System.out.println(arrayAngka3);

        //mengkopi dengan copyOf range
        System.out.println("==== Mengkopi dengan copyOf range ====");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 3, 5);
        print(arrayAngka1);// memiliki address yang berbeda
        System.out.println(arrayAngka1);
        print(arrayAngka4);
        System.out.println(arrayAngka4); //[4, 5] karena range tidak <= atau >=

        //fill array
        System.out.println("=== mengisi array dengan fill ===");
        int[] arrayAngka5 = new int[10];
        print(arrayAngka5);
        Arrays.fill(arrayAngka5, 1); // arrayAngka diisi dengan 100
        print(arrayAngka5);

        //komparasi array
        System.out.println("===== komparasi array =====");
        int[] array6 = {1,2,3,4,5,6};
        int[] array7 = {1,2,3,4,5,6};
        if (array6 == array7){
            System.out.println("KEDUA ARRAY SAMA");
        }else{
            System.out.println("BERBEDA");
        }
        //komparasinya harus memakai equals!!!
        System.out.println(Arrays.equals(array6, array7));
        boolean kondisi = Arrays.equals(array6, array7);
        if(kondisi == true){
            System.out.println("KEDUA ARRAY SAMA");
        }else{
            System.out.println("BERBEDA");
        }

        //untuk mengecek total array mana yang lebih besar
        int[] array9 = {1,2,10}; // mencetak 0 jika sama besar
        int[] array10 = {1,2,3}; // mencetak 1 jika input pertama lebih besar
        System.out.println("array yang lebih besar - "+ Arrays.compare(array9, array10)); // mencetak -1 jika input dua besar

        // mengecek indeks mana yang berbeda 
        System.out.println("indeks yang berbeda adalah - " + Arrays.mismatch(array9, array10));


        //SORT ARRAY
        System.out.println("==== SORT ARRAY ====");
        int[] array11 = {10,12,9,5,17};
        print(array11);
        Arrays.sort(array11); // berfungsi untuk mengurutkan besaran array dari yang terkecil hingga terbesar
        print(array11);
        
        //SEARCH ARRAY
        System.out.println("==== SEARCH ARRAY ===="); // untuk melakukan fungsi ini, array harus di sort terlebih dahulu
        print(array11);                                 // karena jika tidak binary search akan mengsort nya secara otomatis
        int cariAngka = 10;
        System.out.println("angka = " + cariAngka + " ada di index " + Arrays.binarySearch(array11, cariAngka));


        //TUGAS = sort terbalik
        System.out.println("\n\n============TUGAS - SORT TERBALIK==============");
        int[] arrayTugas = {5,2,3,1,4,6};
        print(arrayTugas);

        Arrays.sort(arrayTugas);
        print(arrayTugas);

        int[] arrayJawab = new int[arrayTugas.length];
        int j = arrayTugas.length - 1;

        for (int i = 0; i < arrayTugas.length; i++) {
            arrayJawab[j] = arrayTugas[i];
            j--;
        }
        System.out.println("JAWAB = "+ Arrays.toString(arrayJawab));


        //TUGAS = menjumlahkan dua buah array
        System.out.println("\n\n============TUGAS - MENJUMLAHKAN ARRAY==============");
        int[] arrayA = {1,2,3};
        int[] arrayB = {4,5,6};
        tambahArray(arrayA, arrayB);


        //TUGAS = menjumlahkan dua buah array dengan per index
        System.out.println("\n\n============TUGAS - MENJUMLAHKAN ARRAY PER INDEX==============");
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int[] a = indexJumlah(array1, array2);
        System.out.println(Arrays.toString(a));

        in.close();

    
    }

    //method untuk print array
    private static void print(int[] printArray){
        System.out.println("method print array = "+ Arrays.toString(printArray));
    }

    //method untuk menjumlahkan dua buah array 
    private static void tambahArray(int[] a, int[] b){
        int hasil = 0;

        for (int i = 0; i < a.length; i++) {
            hasil = hasil + a[i]+b[i];
        }
        System.out.println("hasil jumlah dari kedua array adalah = " + hasil);
    }

    //method untuk menjumlahkan tiap index dua buah array
    private static int[] indexJumlah(int a[], int b[]){
        int[] arrayHasil = new int[a.length];
        for (int i = 0; i < arrayHasil.length; i++) {
            arrayHasil[i] = a[i] + b[i];
        } 
        return arrayHasil;
        // System.out.println("array hasil jumlah per index adalah = " + Arrays.toString(arrayHasil));
    }
}
