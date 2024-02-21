import java.util.*;

public class UAP1 {


    private static String riffleShuffle(String s) {
       
        if (s.length()<=1)return s;

        int tengah = s.length() / 2 + s.length() % 2;
        String kesatu = s.substring(0, tengah);
        String kedua = s.substring(tengah);
        
        String acakSatu = riffleShuffle(kesatu);
        String acakDua = riffleShuffle(kedua);
        
        StringBuilder hasil = new StringBuilder();

        for (int i =0; i<kedua.length(); i++) {
            hasil.append(acakSatu.charAt(i)).append(acakDua.charAt(i));
        }

        if (acakSatu.length()>acakDua.length()) {
            hasil.append(acakSatu.charAt(acakSatu.length() - 1));
        }

        return hasil.toString();
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kata = in.nextLine();
        String hasil = riffleShuffle(kata);

        System.out.println(hasil);

        in.close();
    }

}

/*
Malang
ryoaditarta
 */