import java.util.Scanner;

public class esjafn {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        // int looping = in.nextInt();
        // int battery;
        // int i = 0;
        
        // while(i < looping) {
        //     i++;
        //     int time = 0;
        //     battery = in.nextInt();
            
        //     while(battery != 50) {
        //         if(battery < 50){
        //             battery = battery +2;
        //         }else{
        //             battery = battery -3;
        //         }
        //         time++;
        //     } 
        //     System.out.println(time);
        // }

        System.out.println(f1(10));
       
    }
    
    private static boolean f1(int n){
        char[] c = new char [100];
        c[0] = 'z';
        c[1] = 'y';
        c[2] = 'x';
        c[3] = 'w';
        c[4] = 'v';
        c[5] = 'v';
        c[6] = 'w';
        c[7] = 'x';
        c[8] = 'y';
        c[9] = 'z';

        boolean isTrue = true;
        
        for (int i = 0; i < n/2; i++) {
            isTrue = isTrue && (c[i]==c[n-1-i]);
        }

        return isTrue;
    }
    
}

// var inputElements = document.getElementsByTagName('input');

// for(let inputElement of inputElements) {
//   if(inputElement.value == "4") {
//     inputElement.checked = true;
//   }
// }
// jQuery('#saran').html("Dosen berperilaku dan memberikan penjelasan dengan baik");
// jQuery('#form_kuis').submit();