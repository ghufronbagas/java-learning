public class AaNestedLooping {
    public static void main(String[] args){
        
        //Segitiga

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if(i==j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if((i+j) == 4){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

////////////////////////////////////

        for(int i = 0; i < 9; i++){
                    for(int j = 0; j < 9; j++){
                        System.out.print("* ");
                        if(i==j || (i+j)==8){
                            break;
                        }
                    }
                    System.out.print("\n");
                }


        // String bintang = "*";
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.printf("%5s%-5s", bintang, bintang);
        //         if(i==j)break;
        //     }
        //     System.out.print("\n");
        // }



    }
    
}
