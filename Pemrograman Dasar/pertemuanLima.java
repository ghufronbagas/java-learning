peimport java.util.Scanner;


public class pertemuanLima {
    public static void main(String[] args){
        
        int bil, abs;
        System.out.println("Menentukan nilai absolut/n");
        System.out.print("Masukkan bilangan integer: ");
        Scanner input = new Scanner(System.in);
        
        bil = input.nextInt();
        abs = (bil >= 0) ? bil : - bil;
        System.out.printf("Nilai absolutnya adalah : %d",abs);


        System.out.println(".");
        System.out.println("=============================");

        int x = 5; int y = 0;
        boolean b; 
        b = (x > y) && (y >= 0);
        System.out.println(b);


        System.out.println("=====================");

        int r = 24; int s = 35; int c;
        c = r & s;
        System.out.println(c); // c = 0 dikarenakan operasi bilangan bit nya
        c = r | s;
        System.out.println(c); // c = 59

        System.out.println("=====================");

        int g, h = 45;
        g = h^75;   //Nilai h = 102
        System.out.println(g);

        

    }
}