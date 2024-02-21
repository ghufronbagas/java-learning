import java.util.Scanner;


public class ScannerOprAritmatika {
    public static void main(String[] args) { // 17 171 17 17 17 17 17


        Scanner userInput = new Scanner(System.in);

    // Perhitungan dengan scanner menghitung luas persegi panjang
    //luas = panjang*lebar

    Integer panjang, lebar, luas, tinggi, volume;

    System.out.println("----------LUAS PERSEGI PANJANG");

    System.out.print("masukkan panjang = ");
    panjang = userInput.nextInt();
    
    System.out.print("masukkan lebar = ");    
    lebar = userInput.nextInt();

    luas = panjang * lebar;
    System.out.println("luas persegi panjang = " + luas + " cm^2");


    System.out.println("----------MENGHITUNG VOLUME");
    System.out.print("masukkan tinggi = ");
    tinggi = userInput.nextInt();

    volume = luas * tinggi;
    System.out.println("volume balok = " + volume + " cm^3");

    userInput.close();
    


    }
}