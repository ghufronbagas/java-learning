import java.util.*;

public class AALatihanLooping{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // int a = 0;
        // int totalSebeleum = 0;
        // int total = 0;
        // while(a<10){
        //     a++;
        //     total = totalSebeleum + a;
        //     System.out.println("nilai a awal: "+ a);
        //     totalSebeleum = total;
        //     System.out.println("total jumlah dari looping a: " + total);
 
        // }

        //WHILE
        System.out.print("Masukkan nilai awal : ");
        int a = in.nextInt();
        System.out.print("Masukkan batas operasi : ");
        int batas = in.nextInt();

        int total = 0;
        int totalSebeleum = 0;

        //WHILE
        // while(a<batas){
        //     total = totalSebeleum + a;
        //     System.out.println("nilai ke : "+ a);
            
        //     a++;
        //     totalSebeleum = total;
        //     System.out.println("total dari nilai : "+ total);

        // }

        //FOR
        // int b = 0;
        // for(b = a; b<=batas; b++){
        //     total = totalSebeleum + b;
        //     System.out.println("nilai ke = " + b);
            
        //     totalSebeleum = total;
        //     System.out.println("total dari nilai : "+ total);
        // }

        //DO WHILE
        do{
            total = totalSebeleum + a;
            System.out.println("nilai ke : "+ a);
            a++;

            totalSebeleum = total;
            System.out.println("total dari nilai : "+ total);

        }while(a<=batas);


    }
}