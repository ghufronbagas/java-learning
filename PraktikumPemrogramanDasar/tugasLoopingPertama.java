import java.util.*;

public class tugasLoopingPertama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int harga = 0;
        double total = 0;
        int looping = 1;
        String print = "";

        while (true) {
            
            while (true) {
                System.out.print("masukkan harga : ");
                harga = in.nextInt();
                
                if(harga > 0){
                    
                    print = print + "Barang ke-" + looping + " Rp." + harga + "\n";
                    looping++;
                    total = harga + total;
                } else if(harga == 0){
                    break;
                }
            }
            System.out.print(print);

            total = total + (total * 0.1);
            System.out.printf("Total pengeluaran pembeli Rp.%.0f", total);
            break;
            
        }
        
        
        in.close();
    }
    
}