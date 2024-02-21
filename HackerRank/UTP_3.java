import java.util.*;
public class UTP_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = 0;
        int min = 0;

        if(a > b && a > c){
            max = a;
        }else if(b > a && b > a){
            max = b;
        }else if(c > a && c > b){
            max = c;
        }

        if(a < b && a < c){
            min = a;
        }else if(b < a && b < a){
            min = b;
        }else if(c < a && c < b){
            min = c;
        }

        int d = max - min;

        
        System.out.printf("Terbesar %d\n",max);
        System.out.printf("Terkecil %d\n",min);
        System.out.printf("Selisih %d - %d = %d\n",max, min, d);
        if(d%2==0 || d%3==0 || d%5==0 || d%7==0 || d%11==0){
            System.out.print("Habis dibagi ");
            if(d % 2 == 0 ){System.out.print("2 ");}
            if(d % 3 == 0 ){System.out.print("3 ");}
            if(d % 5 == 0 ){System.out.print("5 ");}
            if(d % 7 == 0 ){System.out.print("7 ");}
            if(d % 11 == 0 ){System.out.print("11 ");}
        }else{System.out.printf("Tidak ada");
    } 
    if(d%2==0 && d%3==0 && d%5==0 && d%7==0 && d%11==0){
        System.out.printf("\n%s","Jackpot!!!");
    }else if(d % 2!=0 && d % 3!=0 && d % 5!=0 && d % 7!=0 && d % 11!=0) {
        System.out.printf("\n%s","Jackpot!!!");
    } else {
        System.out.printf("\n%s","Belum hoki!");
    }
    
    
    
    
    }

}
// System.out.printf("%s\n",akhir);

// String akhir = "";
// if((d % 2 == 0) && (d % 3 == 0) && (d % 5 == 0) && (d % 7 == 0) && (d % 11 == 0) ){
//     akhir = "Jackpot!!!";
// }else if((d % 2 != 0) && (d % 3 != 0) && (d % 5 != 0) && (d % 7 != 0) && (d % 11 != 0)){
//     akhir = "Jackpot!!!";
// }else {
//     akhir = "Belum hoki!";
// }
// String pembagi = "";

// if((d % 2 == 0) && (d % 3 == 0) && (d % 5 == 0) && (d % 7 == 0)){
//     pembagi = "2 3 5 7";
// }else if((d % 2 == 0) && (d % 3 == 0) && (d % 5 == 0) && (d % 7 == 0) && (d % 11 == 0)){

// }