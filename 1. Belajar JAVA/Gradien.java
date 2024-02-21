import java.util.Scanner;

public class Gradien {

    public static void main(String [] args){ // 18 18 18 18 18 18 18 18 18 

        Scanner userInput = new Scanner(System.in);

        int m,x,c,y;

    System.out.print("nilai x =");
    x = userInput.nextInt();

    System.out.print("gradien m =");
    m = userInput.nextInt();

    System.out.print("bias c =");
    c = userInput.nextInt();

    y = m*x*x + c;
    System.out.print("nilai y = " + y);

    userInput.close();



    }  
    
}
