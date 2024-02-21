import java.util.*;

public class aaTugasPertama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Double IPK;

        System.out.print("masukkan IPK : ");
        IPK = input.nextDouble();

        
        if ( IPK <= 4 && IPK >= 3.5) {
            System.out.println("Sangat memuaskan");

        } else if(IPK <= 3.4 && IPK >= 3) {
            System.out.println("predikat anda : Memuaskan");

        } else if(IPK <= 2.9 && IPK >= 2.5){
            System.out.println("predikat anda : Baik sekali");

        } else if(IPK <= 2.4 && IPK >= 2.0){
            System.out.println("predikat anda : Baik");

        } else if(IPK < 2) {
            System.out.println("predikat anda : Kurang");

        } else {System.out.println("IPK yang anda masukkan tidak memenuhi format");}

        
    }
    
}
