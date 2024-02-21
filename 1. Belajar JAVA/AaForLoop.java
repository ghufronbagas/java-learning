public class AaForLoop {
    public static void main(String[] args){

        // for(insialisasi; kondisi; stepnilai->(increment/decrement)){
        //     aksi
        // }

        
//increasing        
        int a = 0;
        for(a = 1; a<=10; a++){
            System.out.println("nilai for loop : "+a);
        }

        boolean kondisi = true;
        for(a=5; kondisi; a++){
            System.out.println("nilai for loop kedua : "+ a);
            if(a == 23)
                kondisi=false;

        }

//decreasing
        int x = 0;
        for(x=10; x>=-10; x--){
            System.out.println("nilai for loop decreasing : "+ x);
        }



    }
    
}
