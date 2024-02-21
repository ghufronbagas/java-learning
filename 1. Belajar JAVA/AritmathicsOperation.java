public class AritmathicsOperation {
    public static void main(String[] args){ //4444444444444444444

        //Operasi Aritmatika

        int variable1 = 5;
        int variable2 = 3;

        int hasil;

        //penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " +  hasil);
        
        //pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d + %d = %d \n", variable1, variable2, hasil);
       
        //perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d * %d = %d \n", variable1, variable2, hasil);
       
        //pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n", variable1, variable2, hasil);

        float a = 7;
        float b = 2;
        float hasilFloat = a / b;
        System.out.println(a + " / " + b + " = " + hasilFloat); 
        
        //modulus (memunculkan hasil sisa pembagian, sisa 5 dibagi 3 = 2)
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n", variable1, variable2, hasil);
 





    }
}