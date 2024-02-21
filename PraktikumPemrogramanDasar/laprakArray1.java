import java.util.*;

public class laprakArray1{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[] input = new int[10];
        System.out.println("""
                ======================
                + KALKULATOR 10 DATA +
                ======================
                """);

        while(true){
            System.out.println("""
                1. Input data - (Memasukkan data)
                2. Lihat data - (Melihat data)
                3. Average - (Rata-rata)
                4. Sum - (Jumlah)
                5. Max - (Nilai terbesar)
                6. Min - (Nilai terkecil)
                0. Keluar
                """);
                
            System.out.print("Masukkan pilihan : ");
            int pilihan = in.nextInt();

            switch(pilihan){
                case 1:
                    System.out.print("\nMasukkan data anda -->");
                    for(int i = 0; i < input.length; i++){
                        input[i] = in.nextInt();
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("\nData yang telah anda input -->");
                    System.out.print("[");
                    for (int i = 0; i < input.length; i++) {
                        System.out.print(input[i]);
                        if(i<9){
                            System.out.print(", ");
                        }
                    }
                    System.out.print("]\n\n\n");
                    break;

                case 3:
                    System.out.print("\nRata-rata dari data anda = ");
                    int a = 0;
                    for (int i = 0; i < input.length; i++) {
                        a+=input[i];
                    }
                    double average = a / input.length;
                    System.out.printf("%.1f \n\n", average);
                    break;

                case 4:
                    System.out.print("\nJumlah dari data anda = ");
                    int sum = 0;
                    for (int i = 0; i < input.length; i++) {
                        sum+=input[i];
                    }
                    System.out.println(sum + "\n");
                    break;
                    
                case 5:
                System.out.print("\nNilai terbesar dari data anda = ");
                    int max = Integer.MIN_VALUE;
                    for (int i = 0; i < input.length; i++) {
                        int c = input[i];
                        if(max < c)
                            max = c;
                    }
                    System.out.println(max + "\n");
                    break;
                
                case 6:
                    System.out.print("\nNilai terkecil dari data anda = ");
                    int min = Integer.MAX_VALUE;
                    for (int i = 0; i < input.length; i++) {
                        int d = input[i];
                        if(min > d)
                            min = d;
                    }
                    System.out.println(min + "\n");
                    break;
                
                case 0:
                    in.close();
                    return;

                default:
                    System.out.println("Input pilihan anda salah!!\n");
                    break;

            }
        }

        
    }
}