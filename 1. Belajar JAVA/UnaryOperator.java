public class UnaryOperator {
    public static void main(String[] args) { //666666666666

        //unary = operasi yang dilakukan pada satu variable

        //unari + dan -
        int angka = 1;
        System.out.printf("unary '+' = %d menjadi %d \n",angka,+angka);
        System.out.printf("unary '-' = %d menjadi %d \n",angka,-angka);

        //unary increment dan decrement
        int angka2 = 4;
        System.out.println("nilai = " + angka2);
        angka2++;
        System.out.println("tambahkan '++' lalu nilai menjadi = " + angka2);

        int angka3 = 9;
        System.out.println("nilai = " + angka3);
        angka2--;
        System.out.println("tambahkan '--' lalu nilai menjadi = " + angka2);

        int a = 7;
        System.out.printf("penamabahan '++' prefix nilai menjadi = %d \n",++a);


        //unary boolean dengan !untuk negasi 
        boolean ghufron = true;
        System.out.println("nilai boolean = " + ghufron);
        System.out.println("nilai boolean = " + !ghufron); // penambahan tanda bank(!) akan negasi hasil akhir boolean




    }
    
}
