import java.util.*;

public class TIF_B_UTP_GuntingBatuKertas {
    // NAMA    : Ghufron Bagaskara
    // NIM     : 235150200111012
    // Dilarang menggunakan array, looping, dan method.
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input1 = in.nextLine();

        Scanner delimiter1 = new Scanner(input1);
        delimiter1.useDelimiter(" ");
        String nama1 = delimiter1.next();
        String giliran1 = delimiter1.next();

        String input2 = in.nextLine();

        Scanner delimiter2 = new Scanner(input2);
        delimiter2.useDelimiter(" ");
        String nama2 = delimiter2.next();
        String giliran2 = delimiter2.next();

        if(giliran1.equals("gunting")){
            if(giliran2.equals("gunting")){
                System.out.printf("%s dan %s seri\n", nama1, nama2);;

            }else if(giliran2.equals("batu")){
                System.out.printf("%s menang\n", nama2);

            }else if(giliran2.equals("kertas")){
                System.out.printf("%s menang\n", nama1);
            }
        } else if(giliran1.equals("batu")){
            if(giliran2.equals("gunting")){
                System.out.printf("%s menang\n", nama1);
                
            }else if(giliran2.equals("batu")){
                System.out.printf("%s dan %s seri\n", nama1, nama2);;
                
            }else if(giliran2.equals("kertas")){
                System.out.printf("%s menang\n", nama2);
            }
        } else if(giliran1.equals("kertas")){
            if(giliran2.equals("gunting")){
                System.out.printf("%s menang\n", nama2);
                
            }else if(giliran2.equals("batu")){
                System.out.printf("%s menang\n", nama1);
                
            }else if(giliran2.equals("kertas")){
                System.out.printf("%s dan %s seri\n", nama1, nama2);;
            }
        }


        in.close();
        delimiter1.close();
        delimiter2.close();





    }
    
}
