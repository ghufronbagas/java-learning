public class OperatorLogika {
    public static void main(String[] args){ //999999999999999999

        //Operasi Logika(opr yg dapat dilakukan pada tipe data boolean)
        //AND,OR,XOR(Exclusive OR), dan Negasi

        boolean a,b,c;

System.out.println("----- OR (||) -----" );
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c); 
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c); 
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c); 
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c); 


System.out.println("----- AND (&&) -----" );
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c); 
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c); 
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c); 
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c); 


System.out.println("----- XOR (^) -----" );
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); 
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); 
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); 
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); 


System.out.println("----- NOT/Negasi (!) -----" );
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c); 
        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c); 




    }
    
}
