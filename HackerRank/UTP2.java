import java.util.*;
public class UTP2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        Scanner pemisah1 = new Scanner (input);
        double satu = pemisah1.nextDouble();
        double dua = pemisah1.nextDouble();
        double tiga = pemisah1.nextDouble();


        double satuPangkat = Math.pow(satu, 2);
        double duaPangkat = Math.pow(dua, 2);
        double tigaPangkat = Math.pow(tiga, 2);

        double satudua = satuPangkat + duaPangkat;
        double duatiga = duaPangkat + tigaPangkat;
        double satutiga = satuPangkat + tigaPangkat;


        if(satu == dua && satu == tiga && dua == tiga){
            System.out.println("Segitiga sama sisi");
        }else if(satu==dua || dua==tiga || satu==tiga){
            System.out.println("Segitiga sama kaki");
        }else if( (satudua == tigaPangkat) || (duatiga == satuPangkat) || (satutiga == duaPangkat) ){
            System.out.println("Segitiga siku-siku");
        }else{
            System.out.println("Segitiga sembarang");
        }
        
    }
    
}

// Jika siku-siku: Segitiga siku-siku
// Jika sama sisi: Segitiga sama sisi
// Jika sama kaki: Segitiga sama kaki
// Jika sembarang: Segitiga sembarang