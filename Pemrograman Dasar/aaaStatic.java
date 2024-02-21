public class  aaaStatic{
    static int x; //global var
    int y;

    public static void main(String args[]){
        x = 10;
        aaaStatic.x = 10;

        aaaStatic objectClass = new aaaStatic();
        objectClass.y = 5;

        aaaStatic objectClass2 = new aaaStatic();
        objectClass2.y = 10;


        System.out.println("x global = " + x);
        System.out.println("y milik objectClass = " + objectClass.y);
        System.out.println("y milik objectClass2 = " + objectClass2.y);

        objectClass.x = 18; //jadi karena x merupakan global var maka x akan selalu berubah sesuai terakhir kali di deklarasikan
        objectClass2.x = 90;

        System.out.println("x milik objectClass = " + objectClass.x);
        System.out.println("x milik objectClass2 = " + objectClass2.x);
        System.out.println("x milik aaaStatic = " + aaaStatic.x);
        
    }

    
}