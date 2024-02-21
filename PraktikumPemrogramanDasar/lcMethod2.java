import java.util.*;
//HARI GAJIAN
public class lcMethod2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int a = in.nextInt();
        int b = in.nextInt();
    
        in.nextLine();
        String str = in.nextLine();
        
        int[] array = new int[30];
        int indexing = 0;
    
        for(int i = 0; i < array.length; i++){
            array[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
            if(array[i] == 1)
                indexing++;
        }

        int gajiSatu = a*indexing;

        int temp = 0;
        // int save = 0;

        int gajiKedua = 0;

        // for (int i = 0; i < array.length-1; i++) {
        //     if(array[i]==1 && array[i+1]==array[i]){
        //         temp++;
        //     }else if(temp>save){
        //         save = temp;
        //     } 
        //     temp = 1;
        // }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1){
                temp++;
            }else{
                if(gajiKedua<temp*b)
                    gajiKedua = temp * b;
                temp = 0;
            }
        }
        if(temp*b>gajiKedua)
            gajiKedua = temp*b;
        

        System.out.println(gajiSatu+gajiKedua);

        
    }
}
