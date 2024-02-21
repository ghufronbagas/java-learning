import java.util.Scanner;

public class belanjaStampKelipatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahStamp = 0;

        System.out.println("Masukkan total belanja");
        int belanja = input.nextInt();

        if (belanja > 50000) {
            jumlahStamp = belanja / 50000;
            System.out.println("jumlah stamp yang didapat " + jumlahStamp);
            }
        else {
            System.out.println("Maaf anda tidak dapat kupon");
            }

        System.out.println("Terimakasih sudah berbelanja");
        input.close();
       
            
    }
    
}
