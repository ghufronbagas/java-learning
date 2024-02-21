public class aaaSearching {
    public static void main(String[] args) {

        String[] a = {"kamu", "memakan", "burger", "di", "kanting", "FILKOM"};
        boolean search = linearSearch(a, "kamu");
        int param = linearSearch2(a, "kamu");

        System.out.println("apakah kata kamu termuat dalam array?? " + search);
        System.out.println("berapakah elemen kata kamu di array = " + param );
        
        search = linearSearch(a, "FILKOM");
        param = linearSearch2(a, "FILKOM");

        System.out.println("apakah kata FILKOM termuat dalam array?? " + search);
        System.out.println("berapakah elemen kata FILKOM di array = " + param );

        search = linearSearch(a, "jaman");
        param = linearSearch2(a, "jaman");

        System.out.println("apakah kata jaman termuat dalam array?? " + search);
        System.out.println("berapakah elemen kata jaman di array = " + param );
        
    }
    public static int search(int[] a, int key){
        for(int i = 0; i<a.length; i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearch(String[] array, String key){
        for(String el : array){
            if(el.equals(key)){
                return true;
            }
        }
        return false;
    }
    public static int linearSearch2(String[] array, String key){
        for(int i = 0; i<array.length; i++){
            if(array[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    
}
