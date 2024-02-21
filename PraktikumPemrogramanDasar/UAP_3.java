import java.util.*;


public class UAP_3 {
    static String getStringArray(int[] arr){
        String result = "";
        for(int data: arr){
            result += data + " ";
        }
    
        return result;
    }
    
    static int[] getRankOffensiveOrDefensive(int[] arr){
        int n = arr.length;
        int[] ranking = new int[n];
    
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    rank++;
                }
            }
            ranking[i] = rank;
        }
    
        return ranking;
    }
    
    static int[] calculateRankOverall(int[] arr){
        int n = arr.length;
        int[] ranking = new int[n];
    
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    rank++;
                }
            }
            ranking[i] = rank;
        }
    
        return ranking;
    }
    
    static int[] getRankOverall(int[] arrOffensive, int[] arrDefensive){
        int[] rankOffensive = getRankOffensiveOrDefensive(arrOffensive);
        int[] rankDefensive = getRankOffensiveOrDefensive(arrDefensive);
    
        int[] rankOverall = new int[rankOffensive.length];
        for(int i = 0 ; i < rankDefensive.length ; i++){
            rankOverall[i] = rankDefensive[i] + rankOffensive[i];
        }
    
        return calculateRankOverall(rankOverall);
    }


public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        int[] arrOffen = new int[n];

        String offensiveValue = in.nextLine();
        String[] splitter = offensiveValue.split(" ");

        for(int i = 0 ; i < splitter.length ; i++){
            arrOffen[i] = Integer.parseInt(splitter[i]);
        }

        int[] arrDef = new int[n];

        String deffensiveValue = in.nextLine();
        splitter = deffensiveValue.split(" ");

        for(int i = 0 ; i < splitter.length ; i++){
            arrDef[i] = Integer.parseInt(splitter[i]);
        }

        int t = in.nextInt();
        in.nextLine();

        String[] order = new String[t];

        for(int i = 0 ; i < t ; i++){
            order[i] = in.nextLine();
        }

        for(int i = 0 ; i < t ; i++){
            String orderSplit = order[i];
            splitter = orderSplit.split(" ");

            if(splitter[0].equals("tampil")){
                String orderSub = splitter[1];
                if(orderSub.equals("skill")){
                    System.out.println("Skill ofensif: " + getStringArray(arrOffen));
                    System.out.println("Skill defensif: " + getStringArray(arrDef));
                }else{
                    System.out.println("Rank ofensif: " + getStringArray(getRankOffensiveOrDefensive(arrOffen)));
                    System.out.println("Rank defensif: " + getStringArray(getRankOffensiveOrDefensive(arrDef)));
                    System.out.println("Rank overall: " + getStringArray(getRankOverall(arrOffen, arrDef)));
                }
            }else{
                String type = splitter[1];
                int j = Integer.parseInt(splitter[2]) - 1;
                int value = Integer.parseInt(splitter[3]);
                if(type.equals("ofensif")){
                    arrOffen[j] += value;
                    arrDef[j] -= (value / 2);
                    System.out.println("Melatih skill ofensif pemain ke-" + (j+1) + " sebanyak "  + value + " poin");
                }else{
                    arrDef[j] += value;
                    arrOffen[j] -= (value / 2);
                    System.out.println("Melatih skill defensif pemain ke-" + (j+1) + " sebanyak "  + value + " poin");
                }
            }
        }


        in.close();
    }

}

/*
5
50 40 10 20 30
50 10 20 30 40
3
tampil rank
latih ofensif 3 15
tampil skill
*/

// Rank ofensif: 1 2 5 4 3
// Rank defensif: 1 5 4 3 2
// Rank overall: 1 3 5 3 2
// Melatih skill ofensif pemain ke-3 sebanyak 15 poin
// Skill ofensif: 50 40 25 20 30
// Skill defensif: 50 10 13 30 40