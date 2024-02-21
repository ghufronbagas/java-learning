import java.util.*;

public class cobaCoba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int max = 0;
        int min = 0;
        
        if(a > b && a > c){
            max = a;
        }else if(b > a && b > c){
            max = b;
        }else if(c > a && c > b){
            max = c;
        }
        
        if(a < b && a < c){
            min = a;
        }else if(b < a && b < c){
            min = b;
        }else if(c < a && c < b){
            min = c;
        }
        
        int d = max - min;
        
        System.out.printf("Terbesar %d\n",max);
        System.out.printf("Terkecil %d\n",min);
        System.out.printf("Selisih %d - %d = %d\n",max, min, d);
        
        if((d % 2 == 0) || (d % 3 == 0) || (d % 5 == 0) || (d % 7 == 0) || (d % 11 == 0)){
            System.out.print("Habis dibagi ");
            if(d % 2 == 0 ){System.out.print("2 ");}
            if(d % 3 == 0 ){System.out.print("3 ");}
            if(d % 5 == 0 ){System.out.print("5 ");}
            if(d % 7 == 0 ){System.out.print("7 ");}
            if(d % 11 == 0 ){System.out.print("11 ");}
        }else{System.out.printf("Tidak ada");
    } 
    
    if((d % 2 == 0) && (d % 3 == 0) && (d % 5 == 0) && (d % 7 == 0) && (d % 11 == 0)){
        System.out.printf("\n%s","Jackpot!!!");
    }else if((d % 2 != 0) && (d % 3 != 0) && (d % 5 != 0) && (d % 7 != 0) && (d % 11 != 0)) {
        System.out.printf("\n%s","Jackpot!!!");
    } else {
        System.out.printf("\n%s","Belum hoki!");
    }
    
    
    
    
    
    
    }

}

// int modal = 100000;
// int totalHargaBeli = (250000 * 50/100);


// int pajak = (7/100) * totalHargaBeli;
// System.out.printf("Pajak 7%         :%-26d\n", pajak);

// int 1, 2, 3 = in.nextInt();

// String waktu = in.nextLine();
// System.out.println("=======");

// String intensitasAwal = in.nextLine();
// Scanner pemisah1 = new Scanner (intensitasAwal);
// int intensitas1 = pemisah1.nextInt();
// int intensitas2 = pemisah1.nextInt();
// int intensitas3 = pemisah1.nextInt();
// System.out.println("=================");

// if(waktu.equals("sore")){
//     if((intensitas1 > intensitas2  && intensitas1 < intensitas3) || (intensitas1 < intensitas2  && intensitas1 > intensitas3)){
//         System.out.println("1");
//     }else if((intensitas2 > intensitas1 && intensitas2 < intensitas3) || (intensitas2 < intensitas1 && intensitas2 > intensitas3)){
//         System.out.println("2");
//     }else if((intensitas3 > intensitas1 && intensitas3 < intensitas2) || (intensitas3 < intensitas1 && intensitas3 > intensitas2)){
//         System.out.println("3");
//     }
// }