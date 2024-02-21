public class aaaArgumenTakTentu {
    
    //variadic function ATAU fungsi yang berisi argumen tak tentu 
    public static double rerata(double[] exclude, double... bil){ //param format : non variadic, non variadic, VARIADIC
        double jumlah = 0;
        int count = 0;
        for(double a : bil){ //for each
            boolean isFound = false;
            for(double exc : exclude){
                if(a == exc)
                isFound = false;
            }

            if(!isFound){
                jumlah += a;
                count++;
            }
        }
        return jumlah/count;
    }

    public static void main(String[] args) {
        double[] exclude = {1,2,3,4};

        double[] a = {1,2,3,4,10,20,30};
        
        System.out.println("Rerata = " + rerata(exclude, a));
        System.out.println("Rerata = " + rerata(exclude, 1,2,3,4,10,20,30));

    }
    
}
