import java.util.Scanner;

public class lcSatu {
    public static double punch(double hp) {
        hp = hp - 30;
        return hp;
    }

    public static double kick(double hp) {
        double minus = hp*10/100;
        return hp-minus;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hp = in.nextInt();
        double hp2 = (double) hp;

        int loop = in.nextInt();
        in.nextLine(); 

        for (int i = 0; i < loop; i++) {
            String attack = in.nextLine();
            if (attack.equals("Kick")) {
                hp2 = kick(hp2);
            } else if (attack.equals("Punch")) {
                hp2 = punch(hp2);
            }
        }

        if (hp > 0)
            System.out.printf("%.0f",hp2);
        else
            System.out.println("Monster mati");
    }
}
