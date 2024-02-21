import java.util.*;

public class For_LOOP{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Iterasi ke-" + (i + 1));
        // }

        // System.out.println("Iterasi dengan perubahan langkah:");
        // for (int i = 0; i < 10; i += 2) {
        //     System.out.println("Iterasi ke-" + (i / 2 + 1) + ": " + i);
        // }

        // int i,j;
        // for(i=1, j=30; i<j; i++, j--){
        //     System.out.printf("%04d -- %04d\n", i,j);
        // }
        // System.out.println("");

        // int x;
        // for(x=0; x<=10; ++x){
        //     System.out.printf("%4d ",x);
        // } System.out.println(x);

        // int a;
        // for(a=10; a>=0; a--){
        //     System.out.printf("%4d\n", a);
        // }

                // int n = 4;
                // int jumlah = 0;

                // for(int i = 1; i<=n; i++){
                //     System.out.print("Masukkan jumlah :");
                //     int data = in.nextInt();
                //     jumlah += data;
            
                // }
                // System.out.println("jumlah = " + jumlah);
                // double rerata = jumlah/n;
                // System.out.println("rerata = "+ rerata);

        //INFINITE LOOP
        // int x = 0;
        // for(;;){
        //     System.out.printf("%d  ", ++x);
        //     if(x>=10) break;
        // }

        //NESTED LOOP
        // int x,y;
        // for(x=1; x<=5; x++)
        //     for(y=5; y>=1; y--){
        //         System.out.printf("x = %d | y = %d \n",x,y);
        //     }


        // int x,y;
        // int n = 15;
        // for(x=1; x<=n; x++)
        //     for(y=1; y<=x; y++){
        //         System.out.print("*");
        //     }

//WHILEEE
//LOOP faktorial

        // int n = 15;
        // int faktorial = 1;
        // for(int i = 1; i<=n; i++){
        //     faktorial*=i;
        //     System.out.println(faktorial);

        // }
        // System.out.println("faktorial :"+faktorial);

//WHILE faktorial
        // int n = 10;
        // int faktorial = 1;
        // int i = n;
        // while(i >= 1){
        //     faktorial*=i;
        //     System.out.println(faktorial);
        //     i--;
        // }
        // System.out.println("faktorial :"+faktorial);

//DO WHILE
// pasti akan dijalankan minimal sekali
  // pre checked looping for and while
  // post checked looping do while


//   char pilihan = 'y';
//   do{
//     System.out.println("Pilih menu");
//     System.out.println("1. Penjumlahan");
//     System.out.println("2. Pengurangan");
//     System.out.println("Pilih (1 - 2)?");
    
//     char menu = in.next().charAt(0);
//   }while( pilihan == 'y' || pilihan == 'n');


// ***** BUAT X DARI SPASI ANTAR BINTANG
// * * *
//   * *

        System.out.printf("%s \t %s","Kilogram", "Pounds");






        


        in.close();

    }
}