import java.util.*;


public class switchOperator3 { //23
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        //ekspresi pada switch dapat berupa satuan (int, long, byte, short)

        System.out.print("panggil nama: ");
        String a = input.next();
 
        

        switch(a){
            case "otong":
                System.out.println("Saya otong dan hadir bos");
                break;
            case "asep":
                System.out.println("Saya asep dan hadir bos");
                break;
            case "vander":
                System.out.println("Saya vander dan hadir bos");
                break;

            default:
            System.out.println(a + " tidak hadir pak");
        }

        System.out.println("Program telah selesai");

        input.close();
    }
    
}
