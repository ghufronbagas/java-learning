public class OperatorKomparasi {

    public static void main(String [] args) { //8888888888888888888888

        //operator komparasi (akan menghasilkan nilai dalam bentuk boolean)
//Contoh Pertama
        int a,b;
        a = 10;
        b = 10;

        System.out.printf("%d apakah sama dengan nilai %d %s \n",a,b, (a == b));

//Contoh Kedua
        int c,d;
        c = 1;
        d = 88;
        boolean HasilKomparasi1 = (c == d);

        System.out.printf("%d apakah sama dengan nilai %d %s \n",c,d,HasilKomparasi1);




System.out.println("================================");


System.out.println("----- Operator Equal atau Persamaan");
        int e,f;
        e = 10;
        f = 10;
        boolean HasilKomparasi2 = (e == f);
        System.out.printf("%d == %d --> %s \n",e,f, HasilKomparasi2);
        
System.out.println("----- Operator Not Equal atau Pertidaksamaan");
        int g,h;
        g = 11;
        h = 10;
        boolean HasilKomparasi3 = (g != h); //apakah g tidak sama dengan h?
        System.out.printf("%d != %d --> %s \n",g,h, HasilKomparasi3);

System.out.println("----- Operator Less Than atau Kurang Dari");
        int i,j;
        i = 24;
        j = 50;
        boolean HasilKomparasi4 = (i < j); //apakah g tidak sama dengan h?
        System.out.printf("%d < %d --> %s \n",i,j, HasilKomparasi4);


System.out.println("----- Operator Greater Than atau Lebih Dari");
        int k,l;
        k = 10;
        l = 5;
        boolean HasilKomparasi5 = (k > l); //apakah g tidak sama dengan h?
        System.out.printf("%d > %d --> %s \n",k,l, HasilKomparasi5);





System.out.println("================================");


System.out.println("----- Operator Less Than Equal atau Kurang Dari Sama Dengan");
        int m,n;
        m = 2;
        n = 2;
        boolean HasilKomparasi6 = (m <= n); //apakah g tidak sama dengan h?
        System.out.printf("%d <= %d --> %s \n",m,n, HasilKomparasi6);


System.out.println("----- Operator Greater Than Equal atau Lebih Dari Sama Dengan");
        int o,p;
        o = 5;
        p = 5;
        boolean HasilKomparasi7 = (o >= p); //apakah g tidak sama dengan h?
        System.out.printf("%d >= %d --> %s \n",o,p, HasilKomparasi7);

    }
    
}
