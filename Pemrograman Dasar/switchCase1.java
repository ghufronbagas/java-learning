public class switchCase1 {
    public static void main(String[] args) {

        int hari = 1;


        switch (hari){
           case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
        }

        enum TrafficLight {GREEN, RED, YELLOW};
        TrafficLight lampu = TrafficLight.GREEN;

        switch (lampu){
            case GREEN:
                System.out.println("jalan");
                break;
            case RED:
                System.out.println("Berhenti");
                break;
            case YELLOW:
                System.out.println("Berhati-hati");
                break;
        }

            String cmd = "cetak";
            
            switch (cmd){
                case "CETAK":
                    System.out.println("");
                case "OPERASI" :
            }








    }
    
}
