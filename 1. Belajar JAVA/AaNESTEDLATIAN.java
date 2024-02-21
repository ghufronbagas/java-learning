public class AaNESTEDLATIAN {
    public static void main(String[] args) {

        // Belah Ketupat

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i==j){
                    System.out.print(" ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if((i+j)==4){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");
//////////////////////////////////////////////////////

        for(int i = 0; i < 18; i++){
            for(int j = 0; j < 18; j++){
                System.out.print("* ");
                if(i==j){
                    break;
                }
            }
            System.out.print("\n");
        }
    }
    
}
