public class OperasiBitwise { 
    public static void main(String[] args) { //1010101010101010

    //operator yang dilakukan di bilangan biner(bit)

    byte z = 7;
    String z_bits;
    z_bits = String.format("%8s",Integer.toBinaryString(z)).replace(' ', '0');
    System.out.printf("%s = %d \n",z_bits, z);



System.out.println("======================");
    byte a = 3;
    byte b,c;
    String a_bits, b_bits, c_bits;
        
    //Operator SHIFT LEFT
    System.out.println("===== SHIFT LEFT (<<) =====");
    a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
    System.out.printf("%s = %d \n",a_bits, a);
    
    b = (byte)(a << 4);
    b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0'); 
    System.out.printf("%s = %d \n",b_bits, b);


    //Operator SHIFT RIGHT
    System.out.println("===== SHIFT RIGHT (>>) =====");
    a = 24;
    a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
    System.out.printf("%s = %d \n",a_bits, a);    

    b = (byte)(a >> 2);
    b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0'); 
    System.out.printf("%s = %d \n",b_bits, b);


    //Operator BITWISE OR (|)
    System.out.println("===== BITWISE OR (|)");
    a = 24;
    a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
    System.out.printf("%s = %d \n",a_bits, a);    
    b = 12;
    b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0'); 
    System.out.printf("%s = %d \n",b_bits, b);
System.out.println("------------------> OR");
    c = (byte)(a | b);
    c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
    System.out.printf("%s = %d \n",c_bits, c);


    //Operator BITWISE AND (&)
    System.out.println("===== BITWISE AND (&)");
    a = 24;
    a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
    System.out.printf("%s = %d \n",a_bits, a);    
    b = 12;
    b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0'); 
    System.out.printf("%s = %d \n",b_bits, b);
System.out.println("------------------> AND");
    c = (byte)(a & b);
    c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
    System.out.printf("%s = %d \n",c_bits, c);



    //Operator BITWISE XOR (^)
    System.out.println("===== BITWISE XOR (^)");
    a = 24;
    a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
    System.out.printf("%s = %d \n",a_bits, a);    
    b = 12;
    b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0'); 
    System.out.printf("%s = %d \n",b_bits, b);
System.out.println("------------------> AND");
    c = (byte)(a ^ b);
    c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
    System.out.printf("%s = %d \n",c_bits, c);



    //Operator BITWISE Negasi (~)
    System.out.println("===== BITWISE NEGASI (~)");
    a = 24;
    a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
    System.out.printf("%s = %d \n",a_bits, a);    
    b = (byte) (~a);
    b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24)); 
    System.out.printf("%s = %d \n",b_bits, b);






    








        }
}
